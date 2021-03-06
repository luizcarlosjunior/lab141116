package jaxWS;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import ejb.ProcessEntrega;
import model.Entrega;
import model.Venda;

@WebService
public class EntregaWS{

	@EJB
	ProcessEntrega EJB_ProcessEntrega;

	@WebMethod(operationName="EntregaWS")
	@WebResult(name="resultado")
	public String doGet(){

		// itens
		List<String> itens = Arrays.asList("item 1", "item 2", "item 3");

		//venda
		Venda venda = new Venda();
		venda.setId(1);
		venda.setData(new Date());
		venda.setCliente_nome("João Sem Braço");
		venda.setCliente_endereco("Rua X, n 0");
		venda.setCliente_cpf("000.000.000-00");
		venda.setStatus(1);
		venda.setItens(itens);
		venda.setQtd_itens(itens.size());
		venda.setValor(100.00);

		//entrega fake
		Entrega entrega = new Entrega();
		entrega.setId(1);
		entrega.setData(new Date());
		entrega.setVenda(venda);
		entrega.setStatus(1);

		//enviar para o EJB
		EJB_ProcessEntrega.processarEntrega(entrega);

		return "ok!";
    }

}
