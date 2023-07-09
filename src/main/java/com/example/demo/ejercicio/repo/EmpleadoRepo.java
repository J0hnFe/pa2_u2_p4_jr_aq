package com.example.demo.ejercicio.repo;

import com.example.demo.ejercicio.repo.modelo.Empleado;

public interface EmpleadoRepo {

	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado seleccionar(Integer id);
	public void eliminar(Integer id);
	
}
