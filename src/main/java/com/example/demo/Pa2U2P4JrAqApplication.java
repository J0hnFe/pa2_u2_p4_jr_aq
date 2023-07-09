package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejemplo2.repo.modelo.Alumno;
import com.example.demo.ejemplo2.repo.modelo.Materia;
import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.ejemplo2.service.IMatriculaService;
import com.example.demo.ejercicio.repo.modelo.Habitacion;
import com.example.demo.ejercicio.repo.modelo.Hotel;
import com.example.demo.ejercicio.service.IHotelService;
import com.example.demo.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {
	@Autowired
	private EstudianteService estudianteService;

	@Autowired
	private IMatriculaService matriculaService;
	
	@Autowired
	private IHotelService hotelService;

//	@Autowired
//	private CtaBancariaService bancariaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Alumno alumno = new Alumno();
		alumno.setNombre("Homero");
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Teresa");
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Lupita");
		Materia materia = new Materia();
		materia.setNombre("Literatura");
		Materia materia2 = new Materia();
		materia2.setNombre("Ingles");

		List<Alumno> alumnos = new ArrayList<>();
		alumnos.add(alumno);
		alumnos.add(alumno2);

		List<Materia> materias = new ArrayList<>();
		materias.add(materia);
		materias.add(materia2);

		Matricula matricula = new Matricula();
		matricula.setAlumno(alumno);
		matricula.setFecha(LocalDateTime.now());
		matricula.setMateria(materia);
		matricula.setNumero("001");

		Hotel hotel = new Hotel();
		hotel.setDireccion("Inca");
		hotel.setNombre("Hotel El Fin");

		Habitacion habitacion = new Habitacion();
		habitacion.setHotel(hotel);
		habitacion.setNumero("12");
		habitacion.setValor(new BigDecimal(25));

		Habitacion habitacion2 = new Habitacion();
		habitacion2.setHotel(hotel);
		habitacion2.setNumero("13");
		habitacion2.setValor(new BigDecimal(35));

		List<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(habitacion);
		habitaciones.add(habitacion2);

		hotel.setHabitaciones(habitaciones);

//		this.hotelService.agregar(hotel);
		
		hotelService.buscar(1).getHabitacionesfetch();

//		this.matriculaService.agregar(matricula);
//		 this.estudianteService.buscarTodosDTO().stream().forEach(System.out::println);

//		matriculaService.buscarTodasDTO().stream().forEach(System.out::println);

	}

}
