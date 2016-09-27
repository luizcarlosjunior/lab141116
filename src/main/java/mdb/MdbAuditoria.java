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

import model.Log;
import model.Venda;
import persistencia.HibernateUtil;

@MessageDriven(name = "MdbAuditoria", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda"),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
@TransactionManagement(TransactionManagementType.BEAN)
public class MdbAuditoria implements MessageListener {

    public void onMessage(Message rcvMessage) {


    	Session session = HibernateUtil.getSessionFactory().openSession();
    	session.beginTransaction();

    	ObjectMessage obj = (ObjectMessage) rcvMessage;
        try {
            if (rcvMessage instanceof TextMessage) {
            	Venda venda = (Venda) obj.getObject();

            	//registrar o log
                Log log = new Log(MdbAuditoria.class.toString(), "Recebi a venda: #" + venda.getId());
                session.persist(log);

            } else {
            	//registrar o log
                Log log = new Log(MdbContabilidade.class.toString(), "Não recebi a venda [" + rcvMessage.getClass().getName() + "]");
                session.persist(log);
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }

		session.getTransaction().commit();
		session.close();
    }

}