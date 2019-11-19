package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.repositories.HospedeRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class HospedeService {
	
	@Autowired
	private HospedeRepository repo;
	
	public Hospede find(Integer id){
		Optional<Hospede> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Hospede.class.getName()));
	}
}
