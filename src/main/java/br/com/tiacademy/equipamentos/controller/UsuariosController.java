package br.com.tiacademy.equipamentos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.equipamentos.core.crud.CrudController;
import br.com.tiacademy.equipamentos.domain.Usuarios;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController extends CrudController<Usuarios, Long>{

}
