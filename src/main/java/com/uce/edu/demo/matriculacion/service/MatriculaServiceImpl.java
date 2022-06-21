package com.uce.edu.demo.matriculacion.service;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	public void insertar(LocalDate fecha, Propietario p, Vehiculo v) {
		// TODO Auto-generated method stub
		Matricula matricula=new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(p);
		matricula.setVehiculo(v);
		
		this.matriculaRepository.crear(matricula);
	}

	@Override
	public Matricula consultar(LocalDate fecha) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(fecha);
	}
	
}
