package com.uce.edu.demo.correccion.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("se crea el vehiculo "+vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza el vehiculo "+vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina  "+placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la placa "+placa);
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setPlaca(placa);
		vehiculo.setMarca("Toyota");
		vehiculo.setTipo("P");
		vehiculo.setPrecio(new BigDecimal(1200));
		return vehiculo;
	}

	
}
