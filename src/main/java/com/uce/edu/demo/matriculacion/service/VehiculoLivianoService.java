package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class VehiculoLivianoService implements IVehiculoService {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public BigDecimal valorMatricula (String placa, BigDecimal precio) {
		
		BigDecimal valorPagar=precio.multiply(new BigDecimal(14)).divide(new BigDecimal(100));
		return valorPagar;
	}
	
}
