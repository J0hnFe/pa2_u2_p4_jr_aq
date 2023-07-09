package com.example.demo.ejercicio.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio.repo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel ho) {
		this.entityManager.persist(ho);
	}

	@Override
	public void actualizar(Hotel ho) {
		this.entityManager.merge(ho);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		Hotel hotel = this.entityManager.find(Hotel.class, id);
		System.out.println("Cantidad de habitaciones: " + hotel.getHabitacionesfetch().size());
		return hotel;
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(id);
	}
	
}
