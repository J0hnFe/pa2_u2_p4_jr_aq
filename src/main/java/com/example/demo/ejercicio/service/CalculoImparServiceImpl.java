package com.example.demo.ejercicio.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("impar")
public class CalculoImparServiceImpl implements CalculoExtra{

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		// TODO Auto-generated method stub
		return new BigDecimal(0);
	}

}
