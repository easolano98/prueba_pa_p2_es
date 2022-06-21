package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private LocalDateTime fecha;
	private BigDecimal valorMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	//Set y Get
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	@Override
	public String toString() {
		return "Matricula [fecha=" + fecha + ", valorMatricula=" + valorMatricula + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}
	
	
}
