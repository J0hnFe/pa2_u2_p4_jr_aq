package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "estudiante") // mapear tabla a objeto
@Entity
public class Estudiante {

	@Id // para PK
	//secuencia
	@GeneratedValue(generator = "seq_estu", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_estu", sequenceName = "seq_estu", allocationSize = 1)
	
	
	@Column(name = "estu_id")
	private Integer id;
	
	
	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_nombre") // mapear columnas con atributos
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	// toString
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
