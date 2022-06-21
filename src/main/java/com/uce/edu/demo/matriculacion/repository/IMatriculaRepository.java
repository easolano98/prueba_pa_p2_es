package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDate;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void crear (Matricula m);
	
	public void eliminar(LocalDate fecha );
	
	public Matricula buscar(LocalDate fecha);
	
	public void actualizar(Matricula m);
	
	
}
