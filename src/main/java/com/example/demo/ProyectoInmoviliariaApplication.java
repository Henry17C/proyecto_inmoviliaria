package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		/*
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
		*/
//		Ciudad ciudad= new Ciudad();
//		ciudad.setCabezeraCantonal("Guayaquil");
//		ciudad.setCatidadHabitantes(300000);
//		ciudad.setEdadPromedio(40.5);
//		ciudad.setNombre("Guayaquil");
//		ciudad.setSalarioPromedio(new BigDecimal(500));
//		
//		//ciudadService.ingresar(ciudad);
//		//Ciudad buscar(String nombre, String cabezeraCantonal, Integer catidadHabitantes, BigDecimal salarioPromedio,Double edadPromedio)
//		
//		System.out.println(ciudadService.buscar("Quito", "Quito", 12, new BigDecimal(20),3400.0));
//	    System.out.println(ciudadService.buscar("Guayaquil", "Guayaquil", 200000, new BigDecimal(20),40.5));
//		
//	
//		
		
		//iInmuebleService.buscarPorPrecioDTO(new BigDecimal(200));
		//iInmuebleService.buscarPorPrecioDTO2(new BigDecimal(200));
		System.out.println(iInmuebleService.buscarPorPrecioDTO(new BigDecimal(200)));
		System.out.println(iInmuebleService.buscarPorPrecioDTO2(new BigDecimal(200)));
		
		
	
	
		
		
	}

}
