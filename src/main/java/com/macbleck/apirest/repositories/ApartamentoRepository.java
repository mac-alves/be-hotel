package com.macbleck.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macbleck.apirest.domain.Apartamento;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer> {

}