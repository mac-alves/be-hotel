package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.repositories.FuncionarioRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario buscar(Integer id){
		Optional<Funcionario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Funcionario.class.getName()));
	}	
}