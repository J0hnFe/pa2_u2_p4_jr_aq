package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.Libro;

public interface ILibroService {

	
	
	public void agregar(Libro libro);
	public void actualizar(Libro libro);
	public Libro buscar(Integer id);
	public void borrar(Integer id);
	
}
