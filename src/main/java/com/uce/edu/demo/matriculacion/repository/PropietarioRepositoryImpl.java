package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se asigno propietario "+p.getNombre());
	}

	

	@Override
	public void eliminar(String nombre, String apellido) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el propietario "+nombre+" "+apellido);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Buscando propietario "+ cedula);
		Propietario propietario=new Propietario();
		return propietario;
	}

}
