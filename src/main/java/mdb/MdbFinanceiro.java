package mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import model.Venda;

@MessageDriven(name = "MdbFinanceiro", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "topic/venda"),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })

public class MdbFinanceiro implements MessageListener {

    private final static Logger LOGGER = Logger.getLogger(MdbFinanceiro.class.toString());

    public void onMessage(Message rcvMessage) {
    	ObjectMessage obj = (ObjectMessage) rcvMessage;
        try {
            if (rcvMessage instanceof TextMessage) {
            	Venda venda = (Venda) obj.getObject();
                LOGGER.info(MdbFinanceiro.class.toString() + " - Recebi a venda: " + venda.getId());
            } else {
                LOGGER.warning("Mensagem do tipo errado: " + rcvMessage.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

}