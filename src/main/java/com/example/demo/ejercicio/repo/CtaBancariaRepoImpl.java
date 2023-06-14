package com.example.demo.ejercicio.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repo.modelo.CtaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CtaBancariaRepoImpl implements CtaBancariaRepo{
@Autowired
private EntityManager entityManager;
	@Override
	public void insertar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bancaria);
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

	@Override
	public CtaBancaria encontrar(Integer id) {
		// TODO Auto-generated method stub
		
		return this.entityManager.find(CtaBancaria.class, id);
	}

}
