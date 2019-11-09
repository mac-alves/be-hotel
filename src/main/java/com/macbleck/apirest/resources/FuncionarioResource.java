package com.macbleck.apirest.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.services.FuncionarioService;

@RestController
@RequestMapping(value="/funcionarios")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Optional<Funcionario> obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public ResponseEntity<?> create() {
		Funcionario func = new Funcionario("dasd", "asd", "endereco", "telefone", "dataNascimento", "matricula", "dataAdmissao", "cargo", 2313.43, "nivelAcesso");
		List<Funcionario> obj = service.create(func);
		return ResponseEntity.ok().body(obj);
	}
	
}