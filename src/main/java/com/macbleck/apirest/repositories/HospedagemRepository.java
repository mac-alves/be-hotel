package com.macbleck.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macbleck.apirest.domain.Hospedagem;

@Repository
public interface HospedagemRepository extends JpaRepository<Hospedagem, Integer> {

}
