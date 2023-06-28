package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.Autor;

public interface IAutorService {

	
	public void agregar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void borrar(Integer id);
	
}
