package ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Topic;

import model.Venda;

@Stateless
public class ProcessVenda {


	@Inject
    private JMSContext context;

    @Resource(lookup = "java:/topic/venda")
    private Topic topic;

	public void processarVenda (Venda venda){
		System.out.println("EJB ProcessVenda: VENDA recebida!"); //log

		final Destination destination = topic;

	    try{
	    	System.out.println("EJB ProcessVenda: Processando VENDA"); //log
	    	ObjectMessage obj_msg = context.createObjectMessage();
	    	obj_msg.setObject(venda);
			System.out.println("EJB ProcessVenda: Enviando mensagem para o MDB"); //log
			context.createProducer().send(destination, obj_msg);
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }

	}

}
