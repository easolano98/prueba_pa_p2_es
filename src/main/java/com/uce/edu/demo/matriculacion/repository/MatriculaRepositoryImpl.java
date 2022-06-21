package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository  {

	@Override
	public void crear(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se crea matricula "+m);
	}

	@Override
	public void eliminar(LocalDate fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se elmimina matricula de la fecha "+fecha);
	}

	@Override
	public Matricula buscar(LocalDate fecha) {
		// TODO Auto-generated method stub
		System.out.println("Buscando matricula ");
		Matricula matricula = new Matricula();
	
		return matricula ;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza la matricula "+ m);
	}

}
