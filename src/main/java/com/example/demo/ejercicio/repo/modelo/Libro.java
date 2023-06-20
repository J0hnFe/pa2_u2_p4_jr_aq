package com.example.demo.ejercicio.repo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
public class Libro {
	
	@Id
	@SequenceGenerator(name = "seq_libro", sequenceName = "seq_libro", allocationSize = 1)
	@GeneratedValue(generator = "seq_libro", strategy = GenerationType.SEQUENCE)

	
	@Column(name = "libro_id")
	private Integer id;
	@Column(name = "libro_titulo")
	private String titulo;
	@Column(name = "libro_editorial")
	private String editorial;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "autor_libro",
	joinColumns = @JoinColumn(name="auli_id_libro"),
	inverseJoinColumns = @JoinColumn(name="auli_id_autor"))
	private Set<Autor> autores;

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", editorial=" + editorial + ", autores=" + autores + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	public Integer getId() {
		return id;
	}

	
	
	
	
}
