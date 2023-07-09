package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.repository.modelo.dto.EstudianteDTO;

public interface EstudianteService {

	public void agregar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// se buscamos por id
	public Estudiante buscar(String cedula);

	//eliminamos por un identificador
	public void borrar(String cedula);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public Estudiante buscarPorApellidoyNombre(String apellido,String nombre);
	
	
	public List<Estudiante> buscarListaPorApellido(String apellido);
	
	public Estudiante buscarPorApellidoTyped(String apellido);
	
	public Estudiante buscarPorApellidoNamed(String apellido);
	
	public Estudiante buscarPorApellidoNamedQuery(String apellido);
	
	public Estudiante buscarPorApellidoNativeQuery(String apellido);
	
	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido);

	
	
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	public Estudiante buscarPorNombreNativeQueryNamed(String nombre);
	
	public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso);
	
	public int borrarPorNombre(String nombre);
	
	public int actualizarPorApellido(String nombre,String apellido);
	
	public List<EstudianteDTO> buscarTodosDTO();
	
}
