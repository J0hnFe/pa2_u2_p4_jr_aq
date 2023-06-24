package com.example.demo.ejercicio.repo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(generator = "seq_empl", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_empl", sequenceName = "seq_empl", allocationSize = 1)
	@Column(name = "empl_id")
	private Integer id;
	
	@Column(name = "empl_sueldo")
	private BigDecimal sueldo;

	@Column(name = "empl_cargo")
	private String cargo;

	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "empl_ciu_id")
	private Ciudadano ciudadano;

	// to String
	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", cargo=" + cargo + "]";
	}

	// get y set
	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}



	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	
	
	
}
