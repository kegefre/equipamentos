package br.com.tiacademy.equipamentos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.equipamentos.core.crud.CrudController;
import br.com.tiacademy.equipamentos.domain.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController extends CrudController<Usuario, Long>{

}
