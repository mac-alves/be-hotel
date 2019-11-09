package com.macbleck.apirest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.macbleck.apirest.domain.Apartamento;
import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.domain.Hospedagem;
import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.domain.Reserva;
import com.macbleck.apirest.domain.TipoApartamento;

@SpringBootApplication
public class SpringBootApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiRestApplication.class, args);
		
		Funcionario func = new Funcionario(
				"Mac", 
				"123.435.632-76", 
				"Rua 21 nº 4", 
				"(98)934567854",
				"20-04-2000", 
				"23453", 
				"21-03-2018", 
				"Atendente", 
				1243.56, 
				"Alpha"
			   );

		Hospede hos = new Hospede(
			"Nada", 
			"123.435.632-76", 
			"Rua 21 nº 4", 
			"(98)934567854",
			"20-04-2000", 
			"suite"
			);
		
		TipoApartamento tipo = new TipoApartamento();
		Apartamento apt = new Apartamento();
		Reserva res = new Reserva();
		Hospedagem hosm = new Hospedagem();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("apirest-springboot");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(func);
		em.persist(hos);
		em.persist(tipo);
		em.persist(apt);
		em.persist(res);
		em.persist(hosm);
		em.getTransaction().commit();
				
	}

}
