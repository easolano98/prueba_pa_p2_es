package com.uce.edu.demo.correccion.repository;

import com.uce.edu.demo.correccion.modelo.Propietario;

public interface IPropietarioRepository {
	public void crear(Propietario propietario);
	public void eliminar(String cedula);
	public Propietario consultar(String cedula);

	
}