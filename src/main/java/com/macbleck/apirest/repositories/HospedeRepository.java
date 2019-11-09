package com.macbleck.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macbleck.apirest.domain.Hospede;

@Repository
public interface HospedeRepository extends JpaRepository<Hospede, Integer> {

}
