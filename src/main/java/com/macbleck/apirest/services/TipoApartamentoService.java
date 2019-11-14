package com.macbleck.apirest.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macbleck.apirest.domain.TipoApartamento;
import com.macbleck.apirest.repositories.TipoApartamentoRepository;
import com.macbleck.apirest.services.exceptions.ObjectNotFoundException;

@Service
public class TipoApartamentoService {
	
	@Autowired
	private TipoApartamentoRepository repo;
	
	public TipoApartamento buscar(Integer id){
		Optional<TipoApartamento> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ", Tipo: " + TipoApartamento.class.getName()));
	}	
}
