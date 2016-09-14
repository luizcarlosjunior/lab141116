package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejb.ProcessEntrega;
import model.Entrega;
import model.Venda;

@WebServlet("/entrega")
public class EntregaServlet extends HttpServlet{

	@EJB
	ProcessEntrega EJB_ProcessEntrega;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		// venda fake :P

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

		resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<h1>Olá você está na rota /entrega</h1>");
        out.write("<h2>A venda número '#" + entrega.getId() + "' do Cliente '" + entrega.getVenda().getCliente_nome() + "' foi enviada.</h2>");
    }

}
