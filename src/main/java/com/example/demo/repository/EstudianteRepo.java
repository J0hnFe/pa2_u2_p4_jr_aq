package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface EstudianteRepo {

	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// se buscamos por id
	public Estudiante seleccionar(String cedula);

	//eliminamos por un identificador
	public void eliminar(String cedula);
	
	public Estudiante seleccionarPorApellido(String apellido);
	public Estudiante seleccionarPorApellidoTyped(String apellido);
	public Estudiante seleccionarPorApellidoyNombre(String apellido,String nombre);
	
	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoNamed(String apellido);
	
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
	
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
	
	public Estudiante seleccionarPorNombreNativeQuery(String nombre);
	
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);

	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido);
	
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public int eliminarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre,String apellido);
	
	public List<EstudianteDTO> seleccionarTodosDTO();
	
	
}
