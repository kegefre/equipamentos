package br.com.tiacademy.equipamentos.repository;

import org.springframework.stereotype.Repository;

import br.com.tiacademy.equipamentos.core.crud.CrudRepository;
import br.com.tiacademy.equipamentos.domain.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios,Long>{

}
