package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {
	public void crear(String nombre, String apellido, String edad);
	public Propietario consultar(String cedula);
	public void eliminar(String nombre, String apellido);
	
	
}
