package br.com.tiacademy.equipamentos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiacademy.equipamentos.core.crud.CrudService;
import br.com.tiacademy.equipamentos.domain.Equipamento;
import br.com.tiacademy.equipamentos.domain.Registro;

@Service
public class RegistroService extends CrudService<Registro, Long> {
	@Autowired
	private EquipamentoService serviceEquip;
	
	@Override
	protected Registro editarEntidade(Registro recuperado, Registro entidade) {
		recuperado.setEquipamentoReg(entidade.getEquipamentoReg());
		recuperado.setUsuarioReg(entidade.getUsuarioReg());
		recuperado.setData_s(entidade.getData_s());
		recuperado.setData_e(entidade.getData_e());
		recuperado.setSituacao(entidade.getSituacao());
		return recuperado;
	}
	
	public Registro regSaida(Registro registro) {
		Registro salvo=this.criar(registro);
		Equipamento equip = registro.getEquipamentoReg();
		equip.setDisponiveis(equip.getDisponiveis()-1);
		serviceEquip.editar(registro.getEquipamentoReg().getId(),equip);
		return salvo;
	}
	
	public Registro regEntrada(Registro registro) {
		registro.setSituacao(2);
		this.editar(registro.getId(), registro);
		Equipamento equip = registro.getEquipamentoReg();
		equip.setDisponiveis(equip.getDisponiveis()+1);
		serviceEquip.editar(registro.getEquipamentoReg().getId(),equip);
		return registro;
	}
	
	
}
