package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoRepository {
	
public void insertar(Vehiculo v);
	
	public void actualizar(Vehiculo v );
	
	public void eliminar(String placa);
	
	public Vehiculo buscar(String placa);
	
	
}
