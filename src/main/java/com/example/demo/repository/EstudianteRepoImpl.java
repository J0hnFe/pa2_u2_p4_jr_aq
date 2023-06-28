package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional // Cuando ya declaro EntityManager
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
		// sql
		// SELECT * FROM estudiante e WHERE e.estu_apellido =
		// JPQL
		// SELECT e FROM Estudiante e WHERE e.apellido=

		Query myquery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myquery.setParameter("datoApellido", apellido);
		return (Estudiante) myquery.getSingleResult(); // single un solo resultado

	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query myquery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myquery.setParameter("datoApellido", apellido);
		return myquery.getResultList(); // devuelvo lista (varios resultados)

	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {

		Query myquery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myquery.setParameter("datoApellido", apellido);
		myquery.setParameter("datoNombre", nombre);
		return (Estudiante) myquery.getSingleResult(); // single un solo resultado (un solo resultado)
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {

		TypedQuery<Estudiante> myQuery = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido",
				Estudiante.class);
		query.setParameter("datoApellido", apellido);
		return query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		Query query = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		query.setParameter("datoApellido", apellido);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// USAR SQL PURO :c
		Query myQuery = this.entityManager
				.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);

		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {

		TypedQuery<Estudiante> query = this.entityManager.createNamedQuery("Estudiante.buscarApelllidoNative",
				Estudiante.class);
		query.setParameter("datoApellido", apellido);
		return query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNativeQuery(String nombre) {

		Query query = this.entityManager.createNamedQuery("Estudiante.buscaPorNombre");
		query.setParameter("datoNombre", nombre);
		return (Estudiante) query.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {

		TypedQuery<Estudiante> query = this.entityManager.createNamedQuery("Estudiante.buscarNombreNative",
				Estudiante.class);
		query.setParameter("datoNombre", nombre);
		return query.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido) {

		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
		// 1. especificar tipo de retorno
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);
		// 2. empezamos a crear el SQL
		// 2.1 Definimos el FROM(ROOT)
		Root<Estudiante> myTablaFrom = myCriteriaQuery.from(Estudiante.class); // FROM estudiante
		// 3. Construir las condiciones (where -predicado) de mi SQL (c/condicion un
		// predicado)
		Predicate condicionApellido = myBuilder.equal(myTablaFrom.get("apellido"), apellido);
		// 4. Armar SQL final
		myCriteriaQuery.select(myTablaFrom).where(condicionApellido);

		//5. Ejecucion del query realizamos con TypedQuery
		TypedQuery<Estudiante> queryFinal = this.entityManager.createQuery(myCriteriaQuery); //:o
		
		return queryFinal.getSingleResult();
	}

}
