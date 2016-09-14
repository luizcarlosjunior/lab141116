package ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.ObjectMessage;
import javax.jms.Queue;

import model.Entrega;

@Stateless
public class ProcessEntrega {

	@Inject
    private JMSContext context;

    @Resource(lookup = "java:/queue/pedido")
  	private Queue queue;


	public void processarEntrega (Entrega entrega) {
		System.out.println("EJB ProcessEntrega: ENTREGA recebida"); //log
		final Destination destination = queue;

	    try{
	    	System.out.println("EJB ProcessEntrega: processando ENTREGA"); //log
	    	ObjectMessage obj_msg = context.createObjectMessage();
	    	obj_msg.setObject(entrega);
			System.out.println("EJB ProcessEntrega: Enviando mensagem para o MDB"); //log
			context.createProducer().send(destination, obj_msg);
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
    }

}
