package br.com.tiacademy.equipamentos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.equipamentos.core.crud.CrudController;
import br.com.tiacademy.equipamentos.domain.Equipamentos;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentosController extends CrudController<Equipamentos, Long>{

}
