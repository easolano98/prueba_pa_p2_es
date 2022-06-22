package com.uce.edu.demo.correccion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario "+propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina propietario "+cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propie=new Propietario();
		propie.setApellido("Solano");
		propie.setNombre("Erick");
		propie.setCedula(cedula);
		
		return propie;
	}
	
}
