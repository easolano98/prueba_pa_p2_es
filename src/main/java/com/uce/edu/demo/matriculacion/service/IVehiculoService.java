package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertar(Vehiculo v);
	
	public void actualizar(Vehiculo v );
	
	public void eliminar(String placa);
	
	public Vehiculo buscar(String placa);
	
	public BigDecimal valorMatricula (String placa, BigDecimal precio);
	
	
	
}
