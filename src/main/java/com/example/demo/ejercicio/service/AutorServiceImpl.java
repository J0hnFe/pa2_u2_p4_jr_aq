package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.IAutorRepo;
import com.example.demo.ejercicio.repo.modelo.Autor;
@Service
public class AutorServiceImpl implements IAutorService{
@Autowired
private IAutorRepo autorRepo;

	@Override
	public void agregar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.autorRepo.actualizar(autor);
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.autorRepo.encontrar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.autorRepo.eliminar(id);
	}

}
