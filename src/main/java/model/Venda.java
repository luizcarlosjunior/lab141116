package model;

import java.util.Date;
import java.util.List;

public class Venda {

	int id;
	Date data;
	String cliente_nome;
	String cliente_cpf;
	String cliente_endereco;
	double valor;
	List<String> itens;
	int qtd_itens;
	int status;

	public Venda(){}

	public Venda(int id, Date data, String cliente_nome, String cliente_cpf, String cliente_endereco, double valor, List<String> itens, int qtd_itens, int status) {
		super();
		this.id = id;
		this.data = data;
		this.cliente_nome = cliente_nome;
		this.cliente_cpf = cliente_cpf;
		this.cliente_endereco = cliente_endereco;
		this.valor = valor;
		this.itens = itens;
		this.qtd_itens = qtd_itens;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCliente_nome() {
		return cliente_nome;
	}
	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}
	public String getCliente_cpf() {
		return cliente_cpf;
	}
	public void setCliente_cpf(String cliente_cpf) {
		this.cliente_cpf = cliente_cpf;
	}
	public String getCliente_endereco() {
		return cliente_endereco;
	}
	public void setCliente_endereco(String cliente_endereco) {
		this.cliente_endereco = cliente_endereco;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQtd_itens() {
		return qtd_itens;
	}
	public void setQtd_itens(int qtd_itens) {
		this.qtd_itens = qtd_itens;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
