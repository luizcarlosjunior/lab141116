package model;


import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;

@Entity
@Table(name = "Log")
public class Log implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Version
	@Column(name = "version")
	private int version;

	@Column(nullable = false)
	private String classe;

	@Column(nullable = false)
	private Timestamp data;

	@Column(nullable = false)
	private String mensagem;



	public Log(){}

	public Log(String classe, String mensagem){
		this.data = new Timestamp(Calendar.getInstance().getTimeInMillis());
		this.classe = classe;
		this.mensagem = mensagem;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}




}
