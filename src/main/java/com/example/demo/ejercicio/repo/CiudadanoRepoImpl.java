package com.example.demo.ejercicio.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements CiudadanoRepo{

	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);
		
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);
		
	}

	@Override
	public Ciudadano seleccionar(Integer id) {
		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
		
	}
	
}
