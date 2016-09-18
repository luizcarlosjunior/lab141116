package mdb;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import org.hibernate.Session;

import persistencia.HibernateUtil;
import model.Log;
import model.Venda;

@MessageDriven(name = "MdbVenda", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda "),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbVenda implements MessageListener {

    public void onMessage(Message rcvMessage) {

    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();


    	ObjectMessage obj = (ObjectMessage) rcvMessage;

        try {
            if (rcvMessage instanceof TextMessage) {

            	Venda venda = (Venda) obj.getObject();

            	//registrar o log
                Log log = new Log(MdbVenda.class.toString(), "Recebi a venda: #" + venda.getId());
                session.persist(log);

            } else {

            	//registrar o log
            	Log log = new Log(MdbVenda.class.toString(), "ERRO ao receber a venda [" + rcvMessage.getClass().getName() + "]");
                session.persist(log);

            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

}