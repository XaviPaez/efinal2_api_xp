package com.example.demo.repository;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public void ingresar(Estudiante estudiante);
	public Estudiante obtener(String cedula);
	public Estudiante buscarPorId(Integer id);
}
