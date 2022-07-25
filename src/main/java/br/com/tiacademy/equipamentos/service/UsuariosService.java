package br.com.tiacademy.equipamentos.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Usuario;

@Service
public class UsuariosService extends CrudService<Usuario, Long> {
	@Override
	protected Usuario editarEntidade(Usuario recuperado, Usuario entidade) {
		recuperado.setUsuario(entidade.getUsuario());
		return recuperado;
	}
}
