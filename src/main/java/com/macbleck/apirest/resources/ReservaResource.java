package com.macbleck.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.macbleck.apirest.domain.Reserva;
import com.macbleck.apirest.services.ReservaService;

@RestController
@RequestMapping(value="/reservas")
public class ReservaResource {

	@Autowired
	private ReservaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Reserva obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}	
}
