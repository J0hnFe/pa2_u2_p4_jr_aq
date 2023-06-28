package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EstudianteRepo;
import com.example.demo.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepo estudianteRepo;

	@Override
	public void agregar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		this.estudianteRepo.actualizar(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		return this.estudianteRepo.seleccionar(cedula);
	}

	@Override
	public void borrar(String cedula) {
		this.estudianteRepo.eliminar(cedula);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public List<Estudiante> buscarListaPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante buscarPorApellidoTyped(String apellido) {
		return this.estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNativeQuery(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorApellidoNativeQueryNamed(apellido);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.seleccionarPorNombreNativeQueryNamed(nombre);
	}


}
