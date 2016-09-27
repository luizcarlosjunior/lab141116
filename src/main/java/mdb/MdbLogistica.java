package mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.hibernate.Session;

import model.Entrega;
import model.Log;
import persistencia.HibernateUtil;

@MessageDriven(name = "MdbLogistica", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/pedido"),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
	@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1")
})
@TransactionManagement(TransactionManagementType.BEAN)
public class MdbLogistica implements MessageListener {

    public void onMessage(Message rcvMessage) {

    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

    	ObjectMessage obj = (ObjectMessage) rcvMessage;

        try {
            if (rcvMessage instanceof TextMessage) {

            	Entrega entrega = (Entrega) obj.getObject();

            	//registrar o log
                Log log = new Log(MdbLogistica.class.toString(), "Recebi a entrega: #" + entrega.getId());
                session.persist(log);

            	Thread.sleep(30*1000); // tira um cochilo

            	//registrar o log
                Log log2 = new Log(MdbLogistica.class.toString(), "Entrega: #" + entrega.getId() + " enviada");
                session.persist(log2);

            } else {
            	//registrar o log
                Log log = new Log(MdbLogistica.class.toString(), "Mensagem do tipo errado:  [" + rcvMessage.getClass().getName() + "]");
                session.persist(log);
            }

        } catch (JMSException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }

		session.getTransaction().commit();
		session.close();
    }

}



