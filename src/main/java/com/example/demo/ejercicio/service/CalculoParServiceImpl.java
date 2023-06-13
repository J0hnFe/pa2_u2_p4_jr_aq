package com.example.demo.ejercicio.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.modelo.CtaBancaria;
@Service("par")
public class CalculoParServiceImpl implements CalculoExtra{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		// TODO Auto-generated method stub
		
		BigDecimal extra= precio.multiply(new BigDecimal(0.05));
		
		return extra;
	}

}
