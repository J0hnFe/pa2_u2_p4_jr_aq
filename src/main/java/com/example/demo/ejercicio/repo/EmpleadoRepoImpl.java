package com.example.demo.ejercicio.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements EmpleadoRepo{

	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado seleccionar(Integer id) {
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
	}

	
}
