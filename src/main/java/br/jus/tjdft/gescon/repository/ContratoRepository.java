package br.jus.tjdft.gescon.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.jus.tjdft.gescon.entity.Contrato;

@RepositoryRestResource(collectionResourceRel = "contrato", path = "contrato")
public interface ContratoRepository extends PagingAndSortingRepository<Contrato, Long> {

	List<Contrato> findByNumero(@Param("numero") String numero);
	
	List<Contrato> findByUnidadeGestora(@Param("unidadeGestora") String unidadeGestora);

}