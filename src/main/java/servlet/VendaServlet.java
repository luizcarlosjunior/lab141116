package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ejb.ProcessVenda;
import model.Venda;

@WebServlet("/venda")
public class VendaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@EJB
	ProcessVenda EJB_ProcessVenda;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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

		// gera o html para exibir na tela
		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
	    // html --write
	    out.write("<html>");
	    // header com o title
	    out.write("<head><title>Venda Servlet</title></head>");
	    // mensagem de título
	    out.write("<h1>Olá você está na rota /venda</h1>");
	    // imprime o objeto venda
   	    out.write("<p>Cliente: " + venda.getCliente_nome() +"</p>");
        out.write("<p>CPF: " + venda.getCliente_cpf() +"</p>");
        out.write("<p>Endereço: " + venda.getCliente_endereco() +"</p>");
        out.write("</ br>");
        out.write("<p><strong>: " + venda.getQtd_itens() +" itens (R$ "+ venda.getValor() +")</strong></p>");
        for (int i = 0; i < venda.getQtd_itens(); i++) {
        	out.write("<p>: " + venda.getItens().get(i) +"</p>");
        }
	    out.write("</html>");

    }

}
