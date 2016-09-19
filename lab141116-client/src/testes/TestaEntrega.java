package testes;

import jaxWS.EntregaWS.EntregaWS;
import jaxWS.EntregaWS.EntregaWSService;

public class TestaEntrega {
	public static void main(String[] args){
		EntregaWSService srv = new EntregaWSService();
		EntregaWS port = srv.getEntregaWSPort();
		String resultado = port.entregaWS();
		System.out.println(resultado);
	}
}