package com.example.demo.ejercicio.repo;

import com.example.demo.ejercicio.repo.modelo.Libro;

public interface ILibroRepo {

	public void insertar(Libro libro);
	public void actualizar(Libro libro);
	public Libro encontrar(Integer id);
	public void eliminar(Integer id);
	
}
