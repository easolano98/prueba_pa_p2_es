package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IMatriculaRepository;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;

@Service
public class GestorMatriculaServiceImpl implements GestorMatriculaService {

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService servicePesados;

	@Autowired
	@Qualifier("liviano")
	private IVehiculoService serviceLivianos;

	@Override
	public void Matricular(Matricula m, Vehiculo v, Propietario p) {
		// TODO Auto-generated method stub
		
		this.vehiculoService.insertar(v);
		this.propietarioRepository.insertar(p);
		this.matriculaRepository.crear(m);
	}

	@Override
	public void Imprimir(Matricula m, Vehiculo v, Propietario p) {
		// TODO Auto-generated method stub

		BigDecimal valorTotal = this.calcularValorMatricula(v);
		m.setValorMatricula(valorTotal);
		m.setPropietario(p);
		
		System.out.println("matricula " + m);

	}
	@Override
	public void confirmarMatricula(Vehiculo v, Propietario p, Matricula m) {
		BigDecimal valorTotal= calcularValorMatricula(v);
		
		if (valorTotal.compareTo(new BigDecimal(2000)) > 0) {
			BigDecimal descuento=valorTotal.subtract(m.getValorMatricula().multiply(new BigDecimal(7).divide(new BigDecimal(100))));
			System.out.println("Matriculado Se realiza descuento-> Precio actualizado "+descuento);
			this.Matricular(m,v, p);
			
		} 
		
		else if (valorTotal.compareTo(new BigDecimal(2000)) < 0) {
			System.out.println("Matriculado no aplica descento");
			this.Matricular(m,v, p);
		}

	}

	@Override
	public BigDecimal calcularValorMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		BigDecimal valorPagar = null;

		if (v.getTipo().equals("L")) {
			System.out.println("Carro Liviano " + v.getPlaca());
			valorPagar = this.serviceLivianos.valorMatricula(v.getPlaca(), v.getPrecio());
		} else {
			System.out.println("Carro Pesado " + v.getPlaca());
			valorPagar = this.servicePesados.valorMatricula(v.getPlaca(), v.getPrecio());
		}

		return valorPagar;

	}

}
