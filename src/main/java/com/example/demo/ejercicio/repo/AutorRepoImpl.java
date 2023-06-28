package com.example.demo.ejercicio.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repo.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class AutorRepoImpl implements IAutorRepo{
@Autowired
private EntityManager entityManager;
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);
	}

	@Override
	public Autor encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autor autor= this.encontrar(id);
		this.entityManager.remove(autor);
		
	}

}
