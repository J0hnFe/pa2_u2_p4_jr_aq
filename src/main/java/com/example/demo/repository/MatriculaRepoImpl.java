package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.dto.EstudianteDTO;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepoImpl implements MatriculaRepo {
	@Autowired
	private EntityManager entityManager;

	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> seleccionarTodosDTO() {
		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery("SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(e.alumno, e.materia) FROM Matricula e ", MatriculaDTO.class);
		return query.getResultList();
	}

}
