package mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

import model.Entrega;

@MessageDriven(name = "MdbLogistica", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/pedido"),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
	@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1")
})

public class MdbLogistica implements MessageListener {

    private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

    public void onMessage(Message rcvMessage) {

    	ObjectMessage obj = (ObjectMessage) rcvMessage;

        try {
            if (rcvMessage instanceof TextMessage) {

            	Entrega entrega = (Entrega) obj.getObject();

                LOGGER.info(MdbLogistica.class.toString() + " - Recebi a entrega: #" + entrega.getId());

            	Thread.sleep(30*1000); // tira um cochilo

                LOGGER.info("a entrega foi despachada.");
            } else {
                LOGGER.warning("Mensagem do tipo errado: " + rcvMessage.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
    }

}



