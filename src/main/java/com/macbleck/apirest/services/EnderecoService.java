package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Endereco;
import com.macbleck.apirest.repositories.EnderecoRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository repo;
	
	public Endereco buscar(Integer id){
		Optional<Endereco> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Endereco.class.getName()));
	}	
}