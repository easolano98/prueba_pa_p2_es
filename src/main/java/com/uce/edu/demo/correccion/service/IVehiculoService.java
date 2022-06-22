package com.uce.edu.demo.correccion.service;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

public interface IVehiculoService {
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
	public Vehiculo buscar(String placa);
}
