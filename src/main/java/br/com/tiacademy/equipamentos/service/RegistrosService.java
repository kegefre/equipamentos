package br.com.tiacademy.equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Equipamentos;
import br.com.tiacademy.equipamentos.domain.Registros;

@Service
public class RegistrosService extends CrudService<Registros, Long> {
	@Autowired
	private EquipamentosService serviceEquip;
	
	@Override
	protected Registros editarEntidade(Registros recuperado, Registros entidade) {
		recuperado.setEquip_id(entidade.getEquip_id());
		recuperado.setUsuario_id(entidade.getUsuario_id());
		recuperado.setData_s(entidade.getData_s());
		recuperado.setData_e(entidade.getData_e());
		recuperado.setSituacao(entidade.getSituacao());
		return recuperado;
	}
	
	public Registros regSaida(Registros registro) {
		Registros salvo=this.criar(registro);
		Equipamentos equip = serviceEquip.porId(registro.getEquip_id());
		equip.setDisponiveis(equip.getDisponiveis()-1);
		serviceEquip.editar(registro.getEquip_id(),equip);
		return salvo;
	}
	
	public Registros regEntrada(Registros registro) {
		registro.setSituacao(2);
		this.editar(registro.getId(), registro);
		Equipamentos equip = serviceEquip.porId(registro.getEquip_id());
		equip.setDisponiveis(equip.getDisponiveis()+1);
		serviceEquip.editar(registro.getEquip_id(),equip);
		return registro;
	}
	
	
}
