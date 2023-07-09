package com.example.demo.ejercicio.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio.repo.CtaBancariaRepo;
import com.example.demo.ejercicio.repo.modelo.CtaBancaria;

@Service

public class CtaBancariaServiceImpl implements CtaBancariaService {

	@Autowired
	private CtaBancariaRepo bancariaRepo;
	@Autowired
	@Qualifier("impar")
	private CalculoExtra calculoExtra;
	@Autowired
	@Qualifier("par")
	private CalculoExtra calculoPar;
	
	@Override
	public void aperturar(CtaBancaria bancaria) {
		
		
		
		// TODO Auto-generated method stub
				LocalDate fechaAper=LocalDate.now();
				
				bancaria.setFechaDeApertura(fechaAper);
				Integer diaMes= fechaAper.getDayOfMonth();
				
				if(diaMes%2==0) {
					
					BigDecimal saldoAper=bancaria.getSaldo();
					BigDecimal saldoPromocion=this.calculoPar.calcular(bancaria.getSaldo());
					BigDecimal saldoFinal=saldoAper.add(saldoPromocion);
					bancaria.setSaldo(saldoFinal);
				}else {
					BigDecimal saldoAper=bancaria.getSaldo();
					BigDecimal saldoPromocion=this.calculoExtra.calcular(bancaria.getSaldo());
					BigDecimal saldoFinal=saldoAper.add(saldoPromocion);
					bancaria.setSaldo(saldoFinal);
				}
				
				
				
				this.bancariaRepo.insertar(bancaria);
		
	}

	@Override
	public void actualizar(CtaBancaria bancaria) {
		this.bancariaRepo.actualizar(bancaria);

	}

	@Override
	public CtaBancaria consultar(Integer id) {

		return this.bancariaRepo.encontrar(id);
	}

}
