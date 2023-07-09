package com.example.demo.ejercicio.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "cuenta")
public class CtaBancaria {
	@Id
	@GeneratedValue(generator = "seq_cta", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cta", sequenceName = "seq_cta", allocationSize = 1)
	
	@Column(name = "cta_id")
	private Integer id;
	@Column(name = "cta_numero")
	private String numero;
	@Column(name = "cta_tipo")
	private String tipo;
	@Column(name = "cta_fecha")
	private LocalDate fechaDeApertura;
	@Column(name = "cta_saldo")
	private BigDecimal saldo;
	@Column(name = "cta_cedula")
	private String cedulaPropietario;
	@Override
	public String toString() {
		return "CtaBancaria [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", fechaDeApertura="
				+ fechaDeApertura + ", saldo=" + saldo + ", cedulaPropietario=" + cedulaPropietario + "]";
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaDeApertura() {
		return fechaDeApertura;
	}
	public void setFechaDeApertura(LocalDate fechaDeApertura) {
		this.fechaDeApertura = fechaDeApertura;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getCedulaPropietario() {
		return cedulaPropietario;
	}
	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
}
