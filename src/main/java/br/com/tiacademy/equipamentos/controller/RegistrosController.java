package br.com.tiacademy.equipamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.equipamentos.core.crud.CrudController;
import br.com.tiacademy.equipamentos.domain.Registros;
import br.com.tiacademy.equipamentos.service.RegistrosService;

@RestController
@RequestMapping("/registros")
public class RegistrosController extends CrudController<Registros, Long>{
	
	@Autowired
	RegistrosService service;
	
	@PostMapping("/saida")
	public Registros regSaida(@RequestBody Registros registro) {
		return service.regSaida(registro);
	}
	
	@PutMapping("/entrada")
	public Registros regEntrada(@RequestBody Registros registro) {
		return service.regEntrada(registro);
	}
}
