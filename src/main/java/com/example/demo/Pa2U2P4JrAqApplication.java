package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejemplo2.repo.modelo.Alumno;
import com.example.demo.ejemplo2.repo.modelo.Materia;
import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.ejemplo2.service.IMatriculaService;

@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {
@Autowired
private IMatriculaService iMatriculaService;

	/*
	 * @Autowired private CtaBancariaService bancariaService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Alumno alumno = new Alumno();
		alumno.setNombre("Anddy");
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("John");
		
		
		Materia materia = new Materia();
		materia.setNombre("Progra");
		Materia materia2 = new Materia();
		materia2.setNombre("Bases");
		
		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno);
		alumnos.add(alumno2);
		
		List<Materia> materias = new ArrayList<>();
		materias.add(materia);
		materias.add(materia2);
		
		Matricula matricula2 = new Matricula();
		matricula2.setAlumno(alumno2);
		matricula2.setFecha(LocalDateTime.now());
		matricula2.setMateria(materia);
		matricula2.setNumero("122");
		
		this.iMatriculaService.agregar(matricula2);
		
		
		
				
		
	}

}
