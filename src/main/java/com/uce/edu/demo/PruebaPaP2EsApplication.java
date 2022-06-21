package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.GestorMatriculaService;

@SpringBootApplication
public class PruebaPaP2EsApplication implements CommandLineRunner{
	@Autowired
	private GestorMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Vehiculo1
		
		Matricula matricula1=new Matricula();
		matricula1.setFecha(LocalDateTime.now());
		
		Propietario p=new Propietario();
		p.setCedula("1750053212");
		p.setNombre("Erick");
		p.setApellido("Solano");
		
		Vehiculo carro=new Vehiculo();
		
		carro.setMarca("chevrolet");
		carro.setModelo("aveo");
		carro.setPlaca("IIB-1245");
		carro.setPrecio(new BigDecimal(30000));
		carro.setTipo("P");
		
		this.matriculaService.Imprimir(matricula1, carro, p);
		this.matriculaService.confirmarMatricula(carro, p, matricula1);
		
		System.out.println("------------------------------------");
		
		//Vehiculo2
		
		Matricula matricula2=new Matricula();
		matricula2.setFecha(LocalDateTime.now());
		
		Propietario p2=new Propietario();
		p2.setCedula("1750053212");
		p2.setNombre("Erick");
		p2.setApellido("Solano");
		
		Vehiculo carro2=new Vehiculo();
		
		carro2.setMarca("nissan");
		carro2.setModelo("centra");
		carro2.setPlaca("III-1225");
		carro2.setPrecio(new BigDecimal(900));
		carro2.setTipo("L");
		
		this.matriculaService.Imprimir(matricula1, carro, p);
		this.matriculaService.confirmarMatricula(carro, p, matricula1);
		
	}

}
