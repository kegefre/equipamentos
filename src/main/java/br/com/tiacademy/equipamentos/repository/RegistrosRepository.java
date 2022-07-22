package br.com.tiacademy.equipamentos.repository;

import org.springframework.stereotype.Repository;

import br.com.tiacademy.equipamentos.core.crud.CrudRepository;
import br.com.tiacademy.equipamentos.domain.Registros;

@Repository
public interface RegistrosRepository extends CrudRepository<Registros, Long>{

}
