package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "estudiante") // mapear tabla a objeto
@Entity
//
//@NamedQuery(name = "Estudiante.buscaPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido= :datoApellido")
//
//@NamedQuery(name = "Estudiante.buscaPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre= :datoNombre")

//@NamedNativeQuery(name = "Estudiante.buscarApelllidoNative", query = "SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", resultClass = Estudiante.class)
//@NamedNativeQuery(name = "Estudiante.buscarNombreNative", query = "SELECT * FROM estudiante WHERE estu_nombre= :datoNombre", resultClass = Estudiante.class)

//se pueden crear tantos query como desee

@NamedQueries({

		@NamedQuery(name = "Estudiante.buscaPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido= :datoApellido"),
		@NamedQuery(name = "Estudiante.buscaPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre= :datoNombre") })

@NamedNativeQueries({

		@NamedNativeQuery(name = "Estudiante.buscarApelllidoNative", query = "SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarNombreNative", query = "SELECT * FROM estudiante WHERE estu_nombre= :datoNombre", resultClass = Estudiante.class)

})
public class Estudiante {

	@Id // para PK
	// secuencia
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
	@Column(name = "estu_peso")
	private Double peso;
	
	
	// toString
	

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", peso=" + peso + "]";
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
