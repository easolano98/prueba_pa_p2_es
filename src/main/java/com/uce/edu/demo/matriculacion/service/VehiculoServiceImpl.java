package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
@Primary
public class VehiculoServiceImpl implements IVehiculoService {
	@Autowired
	private IVehiculoRepository vehiculoRepository;

	
	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.insertar(v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		
		return this.vehiculoRepository.buscar(placa);
	}

	@Override
	public BigDecimal valorMatricula(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		return null;
	}

}
