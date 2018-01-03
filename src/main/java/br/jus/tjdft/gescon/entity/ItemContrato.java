package br.jus.tjdft.gescon.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemContrato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String grupo;

	private String numero;

	private String descricao;

	private BigDecimal quantidade;

	private BigDecimal valorUnitario;
	
	@ManyToOne
	@JoinColumn(name = "id_contrato")
	private Contrato contratoDoItem;

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinColumn(name = "id_tipo_item_contrato")
//	private TipoItemContrato tipoItemContrato;
	
	private String idTipoItemContrato;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Contrato getContratoDoItem() {
		return contratoDoItem;
	}

	public void setContratoDoItem(Contrato contratoDoItem) {
		this.contratoDoItem = contratoDoItem;
	}

//	public TipoItemContrato getTipoItemContrato() {
//		return tipoItemContrato;
//	}
//
//	public void setTipoItemContrato(TipoItemContrato tipoItemContrato) {
//		this.tipoItemContrato = tipoItemContrato;
//	}
	
	public String getIdTipoItemContrato() {
		return idTipoItemContrato;
	}

	public void setIdTipoItemContrato(String idTipoItemContrato) {
		this.idTipoItemContrato = idTipoItemContrato;
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
		ItemContrato other = (ItemContrato) obj;
		if (id != other.id)
			return false;
		return true;
	}

}