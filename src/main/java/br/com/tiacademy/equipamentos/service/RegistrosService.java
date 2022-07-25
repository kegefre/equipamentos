package br.com.tiacademy.equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Equipamento;
import br.com.tiacademy.equipamentos.domain.Registro;

@Service
public class RegistrosService extends CrudService<Registro, Long> {
	@Autowired
	private EquipamentosService serviceEquip;
	
	@Override
	protected Registro editarEntidade(Registro recuperado, Registro entidade) {
		recuperado.setEquip_id(entidade.getEquip_id());
		recuperado.setUsuario_id(entidade.getUsuario_id());
		recuperado.setData_s(entidade.getData_s());
		recuperado.setData_e(entidade.getData_e());
		recuperado.setSituacao(entidade.getSituacao());
		return recuperado;
	}
	
	public Registro regSaida(Registro registro) {
		Registro salvo=this.criar(registro);
		Equipamento equip = serviceEquip.porId(registro.getEquip_id());
		equip.setDisponiveis(equip.getDisponiveis()-1);
		serviceEquip.editar(registro.getEquip_id(),equip);
		return salvo;
	}
	
	public Registro regEntrada(Registro registro) {
		registro.setSituacao(2);
		this.editar(registro.getId(), registro);
		Equipamento equip = serviceEquip.porId(registro.getEquip_id());
		equip.setDisponiveis(equip.getDisponiveis()+1);
		serviceEquip.editar(registro.getEquip_id(),equip);
		return registro;
	}
	
	
}
