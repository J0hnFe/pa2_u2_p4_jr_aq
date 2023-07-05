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
		estudiante.setPeso(Double.valueOf(101));
		// this.estudianteService.agregar(estudiante);
		// Estudiante estudianteE = this.estudianteService.buscarPorApellido("Ramos");
		// System.out.println(estudianteE.getApellido());
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre("Anddy");
		estudiante2.setApellido("Quisilema");
		estudiante2.setCedula("1522");
		estudiante2.setPeso(Double.valueOf(90));

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNombre("Felipe");
		estudiante3.setApellido("Ramos");
		estudiante3.setCedula("1001");
		estudiante3.setPeso(Double.valueOf(200));
		// this.estudianteService.agregar(estudiante2);
		// this.estudianteService.agregar(estudiante3);
		/*
		 * List<Estudiante> estudiantes=
		 * this.estudianteService.buscarListaPorApellido("Quisilema");
		 * System.out.println(estudiantes + "\n"); //estudiantes.stream().forEach(sy);
		 * 
		 * Estudiante estudianteNyA=
		 * this.estudianteService.buscarPorApellidoyNombre("Quisilema", "Anddy");
		 * 
		 * System.out.println(estudianteNyA);
		 * 
		 * Estudiante estuATyped =
		 * this.estudianteService.buscarPorApellidoTyped("Ramos");
		 * System.out.println(estuATyped);
		 * 
		 * Estudiante estudianteNMQ =
		 * this.estudianteService.buscarPorApellidoNamedQuery("Ramos");
		 * System.out.println("Estu NQ encontrado = " + estudianteNMQ);
		 * 
		 * Estudiante estudianteN =
		 * this.estudianteService.buscarPorApellidoNamed("Ramos");
		 * System.out.println("estu named encontrado = " + estudianteN);
		 * 
		 * Estudiante estudianteNati=
		 * this.estudianteService.buscarPorApellidoNativeQuery("Ramos");
		 * System.out.println("Estudiante native " + estudianteNati);
		 * 
		 * Estudiante
		 * estudianteNNQ=this.estudianteService.buscarPorApellidoNativeQueryNamed(
		 * "Ramos"); System.out.println(estudianteNNQ);
		 * 
		 * Estudiante
		 * estudianteNatiNom=this.estudianteService.buscarPorNombreNativeQuery("Felipe")
		 * ; System.out.println(estudianteNatiNom);
		 * 
		 * Estudiante
		 * estudianteNatiNamesNom=this.estudianteService.buscarPorNombreNativeQueryNamed
		 * ("Felipe"); System.out.println(estudianteNatiNamesNom);
		 * 
		 */

		Estudiante estudianteDinamico = this.estudianteService.buscarEstudianteDinamico("Felipe", "Ramos",
				Double.valueOf(110));
		System.out.println(estudianteDinamico);
		
//		Integer intAux = this.estudianteService.borrarPorNombre("John");
//		System.out.println(intAux);
		
		Integer intAux = this.estudianteService.actualizarPorApellido("Rafael", "Quisilema");
		System.out.println(intAux);
		
	}

}
