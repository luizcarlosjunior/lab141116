package jaxWS;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import ejb.ProcessProduto;
import model.Produto;

@WebService
public class ProdutoWS {

	@EJB
	ProcessProduto processProduto;

	@WebMethod(operationName = "ProdutoWSCriar")
	@WebResult(name = "ProdutoWSCriarResult")
	public String create(@WebParam(name="nome") String nome, @WebParam(name="codigo") String codigo, @WebParam(name="preco") BigDecimal preco){

		Produto p = new Produto();
		p.setNome(nome);
		p.setCodigo(codigo);
		p.setPreco(preco);
		//cria o novo produto
		return processProduto.create(p);
	}

	@WebMethod(operationName = "ProdutoWSLer")
	@WebResult(name = "ProdutoWSLerResult")
	public String read(@WebParam(name = "id") Long id){
		return processProduto.read(id);
	}

	@WebMethod(operationName = "ProdutoWSAtualizar")
	@WebResult(name = "ProdutoWSAtualizarResult")
	public String update(@WebParam(name = "id") Long id, @WebParam(name="nome") String nome, @WebParam(name="codigo") String codigo, @WebParam(name="preco") BigDecimal preco){

		Produto p = new Produto();
		p.setId(id);
		p.setCodigo(codigo);
		p.setNome(nome);
		p.setPreco(preco);
		return processProduto.update(p);
	}

	@WebMethod(operationName = "ProdutoWSApagar")
	@WebResult(name = "ProdutoWSApagarResult")
	public String delete(@WebParam(name = "id") Long id){
		return processProduto.delete(id);
	}

}
