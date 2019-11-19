package com.macbleck.apirest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.macbleck.apirest.domain.Apartamento;
import com.macbleck.apirest.domain.Endereco;
import com.macbleck.apirest.domain.Funcionario;
import com.macbleck.apirest.domain.Hospede;
import com.macbleck.apirest.domain.Reserva;
import com.macbleck.apirest.domain.TipoApartamento;
import com.macbleck.apirest.domain.enums.CargoFuncionario;
import com.macbleck.apirest.domain.enums.NivelAcesso;
import com.macbleck.apirest.repositories.ApartamentoRepository;
import com.macbleck.apirest.repositories.EnderecoRepository;
import com.macbleck.apirest.repositories.FuncionarioRepository;
import com.macbleck.apirest.repositories.HospedeRepository;
import com.macbleck.apirest.repositories.ReservaRepository;
import com.macbleck.apirest.repositories.TipoApartamentoRepository;

@SpringBootApplication
public class SpringBootApiRestApplication implements CommandLineRunner {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private HospedeRepository hospedeRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private TipoApartamentoRepository  tipoApartamentoRepository;
	
	@Autowired
	private ApartamentoRepository  apartamentoRepository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiRestApplication.class, args);		
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Funcionario func = new Funcionario("Mac", "345.345.345-65", "23-54-1998", "56745", "23-56-1345", 12345.65, CargoFuncionario.ATENDENTE, NivelAcesso.ALPHA);
		Funcionario func2 = new Funcionario("Ana", "345.123.222.-56", "54-65-1234", "65789", "23-45-1256", 12345.65, CargoFuncionario.ATENDENTE, NivelAcesso.BETA);
		
		Hospede hosp1 = new Hospede("arthur", "134.546.345-65", "23-43-6568", "suite");
		Hospede hosp2 = new Hospede("lucia", "567.678.788-65", "23-43-6568", "cobertor");
		Hospede hosp3 = new Hospede("larissa", "346.678.477-65", "23-43-6568", "luz branca");

		Endereco end = new Endereco("rua 34", "45", "qd 3", "vinhais", "65789000", "sao luis", "maranhao", func);
		Endereco end2 = new Endereco("rua 34", "23", "qd 2", "vila luizao", "345345666", "sao luis", "maranhao", func2);
		Endereco end3 = new Endereco("rua 567", "67", "qd 2", "cohama", "87654323", "sao luis", "maranhao", func2);

		TipoApartamento tipo = new TipoApartamento("suite", 1233.45, 2, 2);
		TipoApartamento tipo2 = new TipoApartamento("normal", 5645.45, 1, 1);
		TipoApartamento tipo3 = new TipoApartamento("luxo", 6786.45, 1, 1);
		
		funcionarioRepository.saveAll(Arrays.asList(func, func2));
		hospedeRepository.saveAll(Arrays.asList(hosp1, hosp2, hosp3));
		tipoApartamentoRepository.saveAll(Arrays.asList(tipo, tipo2, tipo3));
		
		Apartamento apt = new Apartamento(101, 1, false, tipo);
		Apartamento apt2 = new Apartamento(102, 1, true, tipo2);
		
		Reserva res1 = new Reserva("23-04-2233T56:32", "22-04-2233T00:00", "3 dias", tipo2, true);
		Reserva res2 = new Reserva("30-02-34567T56:32", "56-87-22345T00:00", "10 dias", tipo, false);
		
		res1.setHospede(hosp1);
		res2.setHospede(hosp2);
		
		//Reserva res1 = new Reserva("23-04-2233T56:32", "22-04-2233T00:00", "3 dias", "suite", true);
				
		//funcionarioRepository.save(func);
		//hospedeRepository.saveAll(Arrays.asList(hosp1, hosp2, hosp3));
		//reservaRepository.save(res1);
		//enderecoRepository.saveAll(Arrays.asList(end, end2));
		
		//res1.getHospedes().addAll(Arrays.asList(hosp1, hosp2, hosp3));
		//res1.setFuncionario(func);
		
		//func.getReservas().add(res1);
		//func.getTelefones().addAll(Arrays.asList("123342323", "23435355"));
		
		//hosp1.getReservas().add(res1);
		//hosp2.getReservas().add(res1);
		//hosp3.getReservas().add(res1);
		
		//hosp1.getTelefones().addAll(Arrays.asList("123342323", "23435355"));
		
		//hospedeRepository.saveAll(Arrays.asList(hosp1, hosp2, hosp3));
		//reservaRepository.save(res1);
		//funcionarioRepository.save(func);	*/	
	}

}
