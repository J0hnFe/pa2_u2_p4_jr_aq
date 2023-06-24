package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.Empleado;

public interface EmpleadoService {

	

	public void agregar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void borrar(Integer id);
	
}
