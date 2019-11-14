package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.Hospedagem;
import com.macbleck.apirest.repositories.HospedagemRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class HospedagemService {
	
	@Autowired
	private HospedagemRepository repo;
	
	public Hospedagem buscar(Integer id){
		Optional<Hospedagem> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + Hospedagem.class.getName()));
	}
}
