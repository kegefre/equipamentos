package br.com.tiacademy.equipamentos.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Registros;

@Service
public class RegistrosService extends CrudService<Registros, Long> {
	@Override
	protected Registros editarEntidade(Registros recuperado, Registros entidade) {
		recuperado.setEquip_id(entidade.getEquip_id());
		recuperado.setUsuario_id(entidade.getUsuario_id());
		recuperado.setData_s(entidade.getData_s());
		recuperado.setData_e(entidade.getData_e());
		recuperado.setSituacao(entidade.getSituacao());
		return recuperado;
	}
	
}
