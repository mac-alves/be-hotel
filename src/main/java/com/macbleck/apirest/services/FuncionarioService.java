package com.macbleck.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario buscar(Integer id) {
		Optional<Funcionario> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Funcionario> create(Funcionario func) {
		repo.save(func);
		return repo.findAll();
	}
}