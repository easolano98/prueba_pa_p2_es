package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.modelo.Vehiculo;
import com.uce.edu.demo.correccion.service.IMatriculaGestorService;
import com.uce.edu.demo.correccion.service.IPropietarioService;
import com.uce.edu.demo.correccion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2EsApplication implements CommandLineRunner{
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2EsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Correccion
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Totota");
		vehiculo.setPlaca("PCT8976");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("L");
		
		this.vehiculoService.insertar(vehiculo);
		
		//2
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setMarca("Toyota");
		this.vehiculoService.actualizar(vehiculo);
		
		//3
		Propietario pro=new Propietario();
		pro.setNombre("Erick");
		pro.setApellido("Solano");
		pro.setCedula("1247123125");
		
		this.propietarioService.crear(pro);
		
		this.gestorService.generar("1247123125", "PCT8976");
		
	}

}
