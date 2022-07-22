package br.com.tiacademy.equipamentos.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Equipamentos;

@Service
public class EquipamentosService extends CrudService<Equipamentos, Long> {
	@Override
	protected Equipamentos editarEntidade(Equipamentos recuperado, Equipamentos entidade) {
		recuperado.setEquipamento(entidade.getEquipamento());
		recuperado.setQuantidade(entidade.getQuantidade());
		return recuperado;
	}
}
