package com.example.demo.ejercicio.repo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {
	@Id
	@SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor", allocationSize = 1)
	@GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)

	@Column(name = "autor_id")
	private Integer id;
	@Column(name = "autor_nombre")
	private String nombre;
	@Column(name = "autor_apellido")
	private String apellido;

	@ManyToMany(mappedBy = "autores",cascade = CascadeType.ALL)
	private Set<Libro> libros;

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libros=" + libros + "]";
	}

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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	public Integer getId() {
		return id;
	}

}
