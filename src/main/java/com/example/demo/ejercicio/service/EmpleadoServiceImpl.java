package com.example.demo.ejercicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.EmpleadoRepo;
import com.example.demo.ejercicio.repo.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepo empleadoRepo;
	
	@Override
	public void agregar(Empleado empleado) {
		this.empleadoRepo.insertar(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.empleadoRepo.actualizar(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.empleadoRepo.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.empleadoRepo.eliminar(id);
	}

	
}
