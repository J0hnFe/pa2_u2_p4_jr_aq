package com.example.demo.ejemplo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejemplo2.repo.IMatriculaRepo;
import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;
@Service
public class MatriculaServiceImpl implements IMatriculaService{
@Autowired
private IMatriculaRepo iMatriculaRepo;
	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepo.agregar(matricula);
	}
	
	@Override
	public List<MatriculaDTO> buscarTodasDTO() {
		return this.iMatriculaRepo.seleccionarTodasDTO();
	}

}
