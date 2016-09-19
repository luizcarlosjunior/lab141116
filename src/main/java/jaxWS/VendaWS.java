package jaxWS;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import ejb.ProcessVenda;
import model.Venda;

@WebService
public class VendaWS{

	@EJB
	ProcessVenda EJB_ProcessVenda;

	@WebMethod(operationName="VendaWS")
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

		// envia o objeto
		EJB_ProcessVenda.processarVenda(venda);
		return "ok!";
    }

}
