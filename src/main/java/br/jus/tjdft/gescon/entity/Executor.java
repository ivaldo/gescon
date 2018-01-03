package br.jus.tjdft.gescon.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Executor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String matricula;
	
	private String titular;
	
	private Date dataInicio;

	private Date dataFim;

	@ManyToOne
	@JoinColumn(name = "id_contrato")
	private Contrato contratoDoExecutor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Contrato getContratoDoExecutor() {
		return contratoDoExecutor;
	}

	public void setContratoDoExecutor(Contrato contratoDoExecutor) {
		this.contratoDoExecutor = contratoDoExecutor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Executor other = (Executor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}