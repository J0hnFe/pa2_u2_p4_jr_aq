package com.example.demo.ejercicio.repo;

import com.example.demo.ejercicio.repo.modelo.Ciudadano;

public interface CiudadanoRepo {


	public void insertar(Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano seleccionar(Integer id);
	public void eliminar(Integer id);
	
}
