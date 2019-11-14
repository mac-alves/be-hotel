package com.macbleck.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.services.HospedeService;

@RestController
@RequestMapping(value="/hospedes")
public class HospedeResource {

	@Autowired
	private HospedeService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Hospede obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}	
}