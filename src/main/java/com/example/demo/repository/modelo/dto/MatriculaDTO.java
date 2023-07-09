package com.example.demo.repository.modelo.dto;

public class MatriculaDTO {

	private String nombreAlumno;
	private String nombreMateria;
	
	public MatriculaDTO() {}
	
	public MatriculaDTO(String nombreAlumno, String nombreMateria) {
		super();
		this.nombreAlumno = nombreAlumno;
		this.nombreMateria = nombreMateria;
	}

	//Getters y Setters
	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	//toString
	@Override
	public String toString() {
		return "MatriculaDTO [nombreAlumno=" + nombreAlumno + ", nombreMateria=" + nombreMateria + "]";
	}

	
	
}
