package com.example.demo.service;

import com.example.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public void guardar(Estudiante estudiante);
	public Estudiante obtener(String cedula);
	public Estudiante buscarPorId(Integer id);

}
