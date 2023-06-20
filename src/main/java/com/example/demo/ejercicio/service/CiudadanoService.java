package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.Ciudadano;

public interface CiudadanoService {

	public void agregar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void borrar(Integer id);
	
}
