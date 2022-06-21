package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String placa;
	private BigDecimal Precio;
	private String tipo;

	// Set y Get
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public BigDecimal getPrecio() {
		return Precio;
	}

	public void setPrecio(BigDecimal precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", Precio=" + Precio + ", tipo="
				+ tipo + "]";
	}

}
