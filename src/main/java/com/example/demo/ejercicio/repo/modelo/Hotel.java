package com.example.demo.ejercicio.repo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	@Id
	@SequenceGenerator(name = "seq_hotel", sequenceName = "seq_hotel", allocationSize = 1)
	@GeneratedValue(generator = "seq_hotel", strategy = GenerationType.SEQUENCE)

	@Column(name = "hotel_id")
	private Integer id;
	@Column(name = "hotel_nombre")
	private String nombre;
	@Column(name = "hotel_direccion")
	private String direccion;

	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<Habitacion> habitaciones;

	@OneToMany(mappedBy = "hotel", fetch = FetchType.LAZY)
	private List<Habitacion> habitacionesfetch;



	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public List<Habitacion> getHabitacionesfetch() {
		return habitacionesfetch;
	}

	public void setHabitacionesfetch(List<Habitacion> habitacionesfetch) {
		this.habitacionesfetch = habitacionesfetch;
	}

	public Integer getId() {
		return id;
	}
	
}
