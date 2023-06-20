package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio.repo.modelo.Autor;
import com.example.demo.ejercicio.repo.modelo.Libro;
import com.example.demo.ejercicio.service.CiudadanoService;
import com.example.demo.ejercicio.service.EmpleadoService;
import com.example.demo.ejercicio.service.IAutorService;
import com.example.demo.ejercicio.service.IHabitacionService;
import com.example.demo.ejercicio.service.IHotelService;
import com.example.demo.ejercicio.service.ILibroService;

@SpringBootApplication
public class Pa2U2P4JrAqApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;
	@Autowired
	private IHotelService hotelService;
	@Autowired
	private IHabitacionService habitacionService;
	@Autowired
	private IAutorService autorService;
	@Autowired
	private ILibroService iLibroService;

	/*
	 * @Autowired private CtaBancariaService bancariaService;
	 */

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4JrAqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// creamos autores
		Autor autor1 = new Autor();
		Autor autor2 = new Autor();
		Autor autor3= new Autor();
		
		
				
		autor1.setNombre("Anddy	");
		autor2.setNombre("John");

		autor1.setApellido("Quisilema");
		autor2.setApellido("Ramos");
		
		autor3.setNombre("Jimy");
		autor3.setApellido("Ortega");
		// creamos lista libros
		
		Set<Libro> libros2 = new HashSet<>();

		// creamos lista autores
		//Set<Autor> autors1 = new HashSet<>();
		
		// agregamos los autores a la lista
		//autors1.add(autor1);
		//autors1.add(autor2);

		// creamos un libro
		 //Libro libro1 = new Libro();
		//libro1.setTitulo("AA2");
//		libro1.setEditorial("Pqq");
		// seteamos los autores del libro 1
//		libro1.setAutores(autors1);

		// agregamos a la lista del libro 1 el libro
		//libros1.add(libro1);

		// a la lista 2 de autores agregamos los autores
		Set<Autor> autors2 = new HashSet<>();
		autors2.add(autor1);
		autors2.add(autor2);
		autors2.add(autor3);
		
		
		
		// creamos el libro 2
		Libro libro2 = new Libro();
		libro2.setTitulo("Redes");
		libro2.setEditorial("Practicas para no morir");

		libro2.setAutores(autors2);
		libros2.add(libro2);
		autor1.setLibros(libros2);
		this.autorService.agregar(autor1);

	}

}
