package mdb;

import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(name = "MdbLogistica", activationConfig = {
	@ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "queue/MdbLogistica"),
	@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
	@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
	@ActivationConfigProperty(propertyName = "maxSession", propertyValue = "1")
})

public class MdbLogistica implements MessageListener {

    private final static Logger LOGGER = Logger.getLogger(MdbLogistica.class.toString());

    public void onMessage(Message rcvMessage) {
        TextMessage msg = null;
        try {
            if (rcvMessage instanceof TextMessage) {
                msg = (TextMessage) rcvMessage;
                LOGGER.info(MdbLogistica.class.toString() + " - Recebi: " + msg.getText());

                try {
                	Thread.sleep(30*1000);
                } catch (InterruptedException e) {
                	e.printStackTrace();
                }

                LOGGER.info("a entrega foi despachada.");
            } else {
                LOGGER.warning("Mensagem do tipo errado: " + rcvMessage.getClass().getName());
            }
        } catch (JMSException e) {
            throw new RuntimeException(e);
        }
    }

}