package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se matriculo el "+v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo con placa "+v.getPlaca());
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo con la placa "+placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Buscando vehiculo con la placa "+placa);
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setTipo("L");
		return vehiculo;
	}

	

}
