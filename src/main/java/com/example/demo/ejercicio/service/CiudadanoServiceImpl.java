package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.CiudadanoRepo;
import com.example.demo.ejercicio.repo.modelo.Ciudadano;
@Service
public class CiudadanoServiceImpl implements CiudadanoService{

	@Autowired
	private CiudadanoRepo ciudadanoRepo;
	
	@Override
	public void agregar(Ciudadano ciudadano) {
		this.ciudadanoRepo.insertar(ciudadano);
		
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.ciudadanoRepo.actualizar(ciudadano);
		
	}

	@Override
	public Ciudadano buscar(Integer id) {
		return this.ciudadanoRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.ciudadanoRepo.eliminar(id);
		
	}

	
}
