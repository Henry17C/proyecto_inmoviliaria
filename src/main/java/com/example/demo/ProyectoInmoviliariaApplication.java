package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repositoty.modelo.Vendedor;
import com.example.demo.service.IVendedorService;

@SpringBootApplication
public class ProyectoInmoviliariaApplication implements CommandLineRunner {

	@Autowired 
	private IVendedorService iVendedorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoInmoviliariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vendedor vendedor= new Vendedor();
		vendedor.setApellido("Benitez");
		vendedor.setCedula("12345");
		vendedor.setEdad(20);
		vendedor.setGenero("F");
		vendedor.setNombre("Melany");
		vendedor.setSalario(new BigDecimal(3000));
		//iVendedorService.registrar(vendedor);
		iVendedorService.actualizarNombre("Madison", "Fernandez", 25, "F", new BigDecimal(2000), new BigDecimal(5000));
		iVendedorService.borrarPorNombreyApellido("Melany", "Benitez",40, "F" );
		
		
	}

}
