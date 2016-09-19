package testes;

import jaxWS.VendaWS.VendaWS;
import jaxWS.VendaWS.VendaWSService;

public class TestaVenda {

	public static void main(String[] args){
		VendaWSService srv = new VendaWSService();
		VendaWS port = srv.getVendaWSPort();
		String resultado = port.vendaWS();
		System.out.println(resultado);
	}
}
