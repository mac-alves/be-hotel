package com.macbleck.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macbleck.apirest.domain.TipoApartamento;

@Repository
public interface TipoApartamentoRepository extends JpaRepository<TipoApartamento, Integer> {

}