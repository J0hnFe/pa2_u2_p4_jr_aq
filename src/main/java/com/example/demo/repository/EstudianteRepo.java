package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteRepo {

	public void insertar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	// se buscamos por id
	public Estudiante seleccionar(String cedula);

	//eliminamos por un identificador
	public void eliminar(String cedula);
	
	
	
}
