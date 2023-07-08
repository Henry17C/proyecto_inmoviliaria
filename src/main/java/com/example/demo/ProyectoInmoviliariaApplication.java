package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.dto.InmuebleDTO;
import com.example.demo.service.ICiudadService;
import com.example.demo.service.IInmuebleService;
import com.example.demo.service.IVendedorService;

@SpringBootApplication
public class ProyectoInmoviliariaApplication implements CommandLineRunner {

	@Autowired 
	private IVendedorService iVendedorService;
	
@Autowired
private ICiudadService ciudadService;

@Autowired
private IInmuebleService iInmuebleService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoInmoviliariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
		
		
		
		List<Inmueble> inmueles= ciudadService.seleccionarCiudad("Quito").getInmuebles();
		for (Inmueble inmueble : inmueles) {
			System.out.println(inmueble);
		}
		
		
	}

}
