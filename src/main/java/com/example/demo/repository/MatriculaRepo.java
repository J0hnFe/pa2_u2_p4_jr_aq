package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface MatriculaRepo {

	public void agregar(Matricula matricula);
	
	public List<MatriculaDTO> seleccionarTodosDTO();
}
