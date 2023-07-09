package com.example.demo.ejemplo2.service;

import java.util.List;

import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaService {
	
	public void agregar(Matricula matricula);
	
	public List<MatriculaDTO> buscarTodasDTO();
}
