package com.macbleck.apirest.services;

import java.util.List;
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
	
	public List<Funcionario> findAll(){
		List<Funcionario> obj = repo.findAll();
		return obj;
	}
	
	public Funcionario find(Integer id){
		Optional<Funcionario> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Funcionario.class.getName()));
	}
	
	public Funcionario insert(Funcionario func) {
		func.setId(null);
		return repo.save(func);
	}
	
	public Funcionario update(Funcionario func) {
		find(func.getId());		
		return repo.save(func);
	}
	
	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}
}