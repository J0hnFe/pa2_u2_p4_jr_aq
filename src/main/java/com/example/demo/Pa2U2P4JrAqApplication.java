package com.example.demo;

import java.util.List;

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

	/*
	 * @Autowired private CtaBancariaService bancariaService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("John");
		estudiante.setApellido("Quisilema");
		estudiante.setCedula("1721");
		// this.estudianteService.agregar(estudiante);
		Estudiante estudianteE = this.estudianteService.buscarPorApellido("Ramos");
		System.out.println(estudianteE.getApellido());
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Anddy");
		estudiante2.setApellido("Quisilema");
		estudiante2.setCedula("1522");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Felipe");
		estudiante3.setApellido("Ramos");
		estudiante3.setCedula("1001");

		//this.estudianteService.agregar(estudiante2);
		//this.estudianteService.agregar(estudiante3);
		List<Estudiante> estudiantes= this.estudianteService.buscarListaPorApellido("Quisilema");
		System.out.println(estudiantes + "\n");
		//estudiantes.stream().forEach(sy);
		
		Estudiante estudianteNyA= this.estudianteService.buscarPorApellidoyNombre("Quisilema", "Anddy");
		
		System.out.println(estudianteNyA);
		
		Estudiante estuATyped  = this.estudianteService.buscarPorApellidoTyped("Ramos");
		System.out.println(estuATyped);
		
		
	}

}
