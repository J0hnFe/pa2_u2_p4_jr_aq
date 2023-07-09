package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.ILibroRepo;
import com.example.demo.ejercicio.repo.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService{

	@Autowired
	private ILibroRepo iLibroRepo;
	
	
	@Override
	public void agregar(Libro libro) {
		this.iLibroRepo.insertar(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		this.iLibroRepo.actualizar(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		return this.iLibroRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iLibroRepo.eliminar(id);
	}

}
