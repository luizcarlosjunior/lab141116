package model;

import java.io.Serializable;
import java.util.Date;

public class Entrega implements Serializable{

	int id;
	Date data;
	Venda venda;
	int status;

	public Entrega(){}

	public Entrega(int id, Date data, Venda venda, int status) {
		super();
		this.id = id;
		this.data = data;
		this.venda = venda;
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
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
