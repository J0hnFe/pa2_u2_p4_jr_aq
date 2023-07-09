package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.CtaBancaria;

public interface CtaBancariaService {

	public void aperturar(CtaBancaria bancaria);
	public void actualizar(CtaBancaria bancaria);
	public CtaBancaria consultar(Integer id);
	
}
