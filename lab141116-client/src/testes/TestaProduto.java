package testes;

import java.math.BigDecimal;

import jaxWS.ProdutoWS.ProdutoWS;
import jaxWS.ProdutoWS.ProdutoWSService;

public class TestaProduto {


	public static void main(String[] args) {

		// chama o serviço
		ProdutoWSService srv = new ProdutoWSService();
		ProdutoWS port = srv.getProdutoWSPort();

		// cadastra o produto
		String criar_retorno = port.produtoWSCriar("Produto 1", "3216516516", new BigDecimal("100"));
		// retorno
		System.out.println(criar_retorno);

		// atualiza o produto
		String atualiza_retorno = port.produtoWSAtualizar(1, "Produto 1 - atualizado", "3216516516654", new BigDecimal("199"));
		// retorno
		System.out.println(atualiza_retorno);

		//le o produto
		String ler_retorno = port.produtoWSLer(1);
		// retorno
		System.out.println(ler_retorno);

		//apaga o produto
		String apagar_retorno = port.produtoWSApagar(1);
		// retorno
		System.out.println(apagar_retorno);
	}


}
