package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository propietarioRepository;
	
	
	@Override
	public void crear(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		Propietario p=new Propietario();
		p.setNombre(nombre);
		p.setApellido(apellido);
		p.setCedula(cedula);
		
		this.propietarioRepository.insertar(p);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscar(cedula);
	}

	@Override
	public void eliminar(String nombre, String apellido) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(nombre, apellido);
	}

	
	
	

}
