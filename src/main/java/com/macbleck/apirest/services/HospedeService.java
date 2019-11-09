package com.macbleck.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.repositories.HospedeRepository;

@Service
public class HospedeService {

	private HospedeRepository repo;
	
	public Optional<Hospede> buscar(Integer id){
		return repo.findById(id);
	}
	
	public List<Hospede> create(Hospede hosp){
		repo.save(hosp);
		return repo.findAll();
	}
}
