package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repo.modelo.Hotel;
import com.example.demo.ejercicio.service.IHotelService;
import com.example.demo.repository.modelo.Alumno;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.Materia;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;
import com.example.demo.service.EstudianteService;
import com.example.demo.service.MatriculaService;

@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	@Autowired
	private IHotelService hotelService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Alumno alumno = new Alumno();
//		alumno.setNombre("Roberto");
//		
//		Alumno alumno2 = new Alumno();
//		alumno2.setNombre("Lucia");
//		
//		Materia materia = new Materia();
//		materia.setNombre("Mates");
		
//		Matricula matricula = new Matricula();
//		matricula.setAlumno(alumno);
//		matricula.setMateria(materia);
//		matricula.setFecha(LocalDateTime.now());
//		matricula.setNumero("1234");
//		this.matriculaService.agregar(matricula);

		Estudiante estudiante = new Estudiante();
		estudiante.setNombre("John");
		estudiante.setApellido("Ramos");
		estudiante.setCedula("1721");
		estudiante.setPeso(Double.valueOf(101));
//		this.estudianteService.agregar(estudiante);
		
//		Estudiante estudianteE = this.estudianteService.buscarPorApellido("Ramos");
//		System.out.println(estudianteE.getApellido());
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Anddy");
		estudiante2.setApellido("Quisilema");
		estudiante2.setCedula("1522");
		estudiante2.setPeso(Double.valueOf(90));

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Margot");
		estudiante3.setApellido("Robbie");
		estudiante3.setCedula("1001");
		estudiante3.setPeso(Double.valueOf(200));
//		this.estudianteService.agregar(estudiante2);
//		this.estudianteService.agregar(estudiante3);

//		List<EstudianteDTO> estudiantes = this.estudianteService.buscarTodosDTO();
//		estudiantes.stream().forEach(System.out::println);
		
//		List<MatriculaDTO> matriculas = this.matriculaService.buscarTodosDTO();
//		matriculas.stream().forEach(System.out::println);
//		System.out.println(matriculas);
		
//		List<Hotel> hotels = this.hotelService.

	}

}
