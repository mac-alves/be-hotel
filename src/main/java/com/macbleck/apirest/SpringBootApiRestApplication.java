package com.macbleck.apirest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.domain.Reserva;
import com.macbleck.apirest.repositories.FuncionarioRepository;
import com.macbleck.apirest.repositories.HospedeRepository;
import com.macbleck.apirest.repositories.ReservaRepository;

@SpringBootApplication
public class SpringBootApiRestApplication implements CommandLineRunner {
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiRestApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Funcionario func = new Funcionario("bla", "cpf", "endereco", "telefone", "dataNascimento", "matricula", "dataAdmissao", "cargo", 12345.65, "nivelAcesso");
		
		Reserva res1 = new Reserva("23-04-2233T56:32", "22-04-2233T00:00", "3 dias", "suite", true);
		
		Hospede hosp1 = new Hospede("mac", "134.546.345-65", "rua 37", "(98)982546372", "23-43-6568", "suite");
		Hospede hosp2 = new Hospede("nada", "567.678.788-65", "rua 57", "(98)982546372", "23-43-6568", "suite");
		Hospede hosp3 = new Hospede("tudo", "346.678.477-65", "rua 67", "(98)982546372", "23-43-6568", "suite");

		funcionarioRepository.save(func);
		hospedeRepository.saveAll(Arrays.asList(hosp1, hosp2, hosp3));
		reservaRepository.save(res1);
		
		res1.getHospedes().addAll(Arrays.asList(hosp1, hosp2, hosp3));
		res1.setFuncionario(func);
		
		func.getReservas().add(res1);
		
		hosp1.getReservas().add(res1);
		hosp2.getReservas().add(res1);
		hosp3.getReservas().add(res1);
		
		hospedeRepository.saveAll(Arrays.asList(hosp1, hosp2, hosp3));
		reservaRepository.save(res1);
		funcionarioRepository.save(func);		
	}

}
