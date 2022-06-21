package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar(Propietario p);
	
	
	public void eliminar(String nombre, String apellido);
	
	public Propietario buscar(String cedula);
}
