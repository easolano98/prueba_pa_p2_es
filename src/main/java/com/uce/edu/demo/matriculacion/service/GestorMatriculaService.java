package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface GestorMatriculaService {
	public void Matricular(Matricula m, Vehiculo v, Propietario p);
	public void Imprimir(Matricula m, Vehiculo v, Propietario p);
	public BigDecimal calcularValorMatricula(Vehiculo v);
	public void confirmarMatricula(Vehiculo v, Propietario p, Matricula m);
}
