package com.example.demo.ejemplo2.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ejemplo2.repo.modelo.Matricula;
import com.example.demo.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {
	@Autowired
	private EntityManager entityManager;

	@Override
	public void agregar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> seleccionarTodasDTO() {
		TypedQuery<MatriculaDTO> query = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.repository.modelo.dto.MatriculaDTO(m.alumno.nombre, m.materia.nombre) FROM Matricula m",
				MatriculaDTO.class);
		return query.getResultList();
	}
}
