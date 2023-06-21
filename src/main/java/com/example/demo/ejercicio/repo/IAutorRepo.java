package com.example.demo.ejercicio.repo;

import com.example.demo.ejercicio.repo.modelo.Autor;

public interface IAutorRepo {

	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor encontrar(Integer id);
	public void eliminar(Integer id);
	
}
