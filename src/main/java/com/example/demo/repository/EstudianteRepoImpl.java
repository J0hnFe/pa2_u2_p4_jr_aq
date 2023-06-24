package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional			//Cuando ya declaro EntityManager
public class EstudianteRepoImpl implements EstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);  
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.entityManager.merge(estudiante);

	}

	@Override
	public Estudiante seleccionar(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);

	}

	@Override
	public void eliminar(String cedula) {
		Estudiante e = this.seleccionar(cedula);
		this.entityManager.remove(e);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		//sql
		// SELECT * FROM estudiante e WHERE e.estu_apellido = 
		//JPQL 
		//SELECT e FROM Estudiante e WHERE e.apellido=
		
		
		Query myquery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myquery.setParameter("datoApellido", apellido);
		return (Estudiante) myquery.getSingleResult(); //single un solo resultado
		
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myquery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myquery.setParameter("datoApellido", apellido);
		return  myquery.getResultList(); //devuelvo lista (varios resultados)
		
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		
		Query myquery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myquery.setParameter("datoApellido", apellido);
		myquery.setParameter("datoNombre", nombre);
		return (Estudiante) myquery.getSingleResult(); //single un solo resultado (un solo resultado)
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		
		TypedQuery<Estudiante> myQuery =  this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
		
		
		
	}

}
