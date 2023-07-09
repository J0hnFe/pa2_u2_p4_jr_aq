package com.example.demo.ejemplo2.repo;

import java.util.List;

import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaRepo {

	public void agregar(Matricula matricula);
	
	public List<MatriculaDTO> seleccionarTodasDTO();
	
}
