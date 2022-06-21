package com.uce.edu.demo.matriculacion.service;

import java.time.LocalDate;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IMatriculaService {
	public void insertar(LocalDate fecha, Propietario p, Vehiculo v);
	public Matricula consultar(LocalDate fecha);
	
}
