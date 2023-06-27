package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

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
	
}
