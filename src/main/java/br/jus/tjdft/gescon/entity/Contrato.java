package br.jus.tjdft.gescon.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String numero;

	private String objeto;

	private String elementoDeDespesa;

	private String numeroPaContrato;

	private String numeroPaPagamento;

	private BigDecimal valorGlobal;

	private Date dataInicioVigencia;

	private Date dataFimVigencia;

	private String unidadeGestora;

	@OneToMany(mappedBy = "contratoDoExecutor", targetEntity = Executor.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Executor> executores;
	
	@OneToMany(mappedBy = "contratoDoItem", targetEntity = ItemContrato.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItemContrato> itens;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getElementoDeDespesa() {
		return elementoDeDespesa;
	}

	public void setElementoDeDespesa(String elementoDeDespesa) {
		this.elementoDeDespesa = elementoDeDespesa;
	}
	
	public String getNumeroPaContrato() {
		return numeroPaContrato;
	}

	public void setNumeroPaContrato(String numeroPaContrato) {
		this.numeroPaContrato = numeroPaContrato;
	}

	public String getNumeroPaPagamento() {
		return numeroPaPagamento;
	}

	public void setNumeroPaPagamento(String numeroPaPagamento) {
		this.numeroPaPagamento = numeroPaPagamento;
	}

	public BigDecimal getValorGlobal() {
		return valorGlobal;
	}

	public void setValorGlobal(BigDecimal valorGlobal) {
		this.valorGlobal = valorGlobal;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public Date getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(Date dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public String getUnidadeGestora() {
		return unidadeGestora;
	}

	public void setUnidadeGestora(String unidadeGestora) {
		this.unidadeGestora = unidadeGestora;
	}

	public List<Executor> getExecutores() {
		return executores;
	}

	public void setExecutorList(List<Executor> executores) {
		this.executores = executores;
	}

	public List<ItemContrato> getItens() {
		return itens;
	}

	public void setItens(List<ItemContrato> itens) {
		this.itens = itens;
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
		Contrato other = (Contrato) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}