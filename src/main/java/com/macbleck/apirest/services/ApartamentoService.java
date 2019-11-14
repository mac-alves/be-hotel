package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Apartamento;
import com.macbleck.apirest.repositories.ApartamentoRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class ApartamentoService {

	@Autowired
	private ApartamentoRepository repo;
	
	public Apartamento buscar(Integer id){
		Optional<Apartamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Apartamento.class.getName()));
	}	
}