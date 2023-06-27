package com.example.demo.ejemplo2.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejemplo2.repo.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{
@Autowired
private EntityManager entityManager;
	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

}
