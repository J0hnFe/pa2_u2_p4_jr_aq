package com.example.demo.repository.modelo.dto;

//Campo DTO exclusivamente con los atributos que necesito
public class EstudianteDTO {
	
	private String nombre;	
	private String apellido;
	
	public EstudianteDTO() {}	//Es buena practica ponerlo explicitamente si hay otro constructor
	
	public EstudianteDTO(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//toString
	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	//Getters y Setters
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
}
