package com.example.demo.ejercicio.repo;

import com.example.demo.ejercicio.repo.modelo.CtaBancaria;

public interface CtaBancariaRepo {

	public void insertar(CtaBancaria bancaria);
	public void actualizar(CtaBancaria bancaria);
	public CtaBancaria encontrar(Integer id);
	
	
}
