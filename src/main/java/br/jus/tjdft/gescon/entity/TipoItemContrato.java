package br.jus.tjdft.gescon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoItemContrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String descricao;
	
//	@OneToMany(mappedBy = "tipoItemContrato", targetEntity = ItemContrato.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<ItemContrato> itensDoTipoItemContrato;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
//	public List<ItemContrato> getItensDoTipoItemContrato() {
//		return itensDoTipoItemContrato;
//	}
//	
//	public void setItensDoTipoItemContrato(List<ItemContrato> itensDoTipoItemContrato) {
//		this.itensDoTipoItemContrato = itensDoTipoItemContrato;
//	}

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
		TipoItemContrato other = (TipoItemContrato) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}