package com.example.demo.ejercicio.service;

import com.example.demo.ejercicio.repo.modelo.Hotel;

public interface IHotelService {


	public void agregar(Hotel ho);
	public void actualizar(Hotel ho);
	public Hotel buscar(Integer id);
	public void borrar(Integer id);
	
}
