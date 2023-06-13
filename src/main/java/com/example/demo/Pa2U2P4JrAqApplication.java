package com.example.demo;



import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repo.modelo.CtaBancaria;
import com.example.demo.ejercicio.service.CtaBancariaService;


@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {

	@Autowired
	private CtaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	CtaBancaria bancaria = new CtaBancaria();
	bancaria.setCedulaPropietario("17210");
	
	bancaria.setNumero("11100");
	bancaria.setSaldo(new BigDecimal(100));
	bancaria.setTipo("A");
	
	
	//this.bancariaService.aperturar(bancaria);
	
	CtaBancaria bancaBuscar=this.bancariaService.consultar(9);
	bancaBuscar.setNumero("555");
	this.bancariaService.actualizar(bancaBuscar);
	CtaBancaria bancariaB= this.bancariaService.consultar(9);
	
	System.out.println("Cuenta con dia impar " + bancariaB.getSaldo());
	CtaBancaria bancariaC= this.bancariaService.consultar(10);
	System.out.println("Cuenta con dia par " + bancariaC.getSaldo());
		
	
		

	}

}
