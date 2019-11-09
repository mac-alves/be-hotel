package com.macbleck.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macbleck.apirest.domain.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

}
