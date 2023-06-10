package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {

	@Autowired
	private EstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		Estudiante estudiante = new Estudiante();
		estudiante.setApellido("Ramos");
		estudiante.setCedula("1245");
		estudiante.setNombre("John");
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Quisilema");
		estudiante2.setCedula("15874");
		estudiante2.setNombre("Anddy");
		
		this.estudianteService.agregar(estudiante2);
		*/
		
		/*
		Estudiante e = this.estudianteService.buscar("15874");
		System.out.println("Estudiante encontrado: " + e);
		
		e.setNombre("Rafael");
		this.estudianteService.actualizar(e);
		System.out.println("Estudiante actualizado: " + e);
		*/
		
		this.estudianteService.borrar("15874");
		

	}

}
