package br.com.tiacademy.equipamentos.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Usuarios;

@Service
public class UsuariosService extends CrudService<Usuarios, Long> {
	@Override
	protected Usuarios editarEntidade(Usuarios recuperado, Usuarios entidade) {
		recuperado.setUsuario(entidade.getUsuario());
		return recuperado;
	}
}
