package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repositoty.modelo.Cliente;
import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.Vendedor;
import com.example.demo.service.IVendedorService;

import jakarta.transaction.Transactional;

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
	
		System.out.println(",");
		
		
		
//		List<Inmueble> inmueles= ciudadService.seleccionarCiudad("Quito").getInmuebles();
//		for (Inmueble inmueble : inmueles) {
//			System.out.println(inmueble);
//		}
		
		System.err.println("-----------RIGH JOIN----------");
		List<Vendedor> venderores1= iVendedorService.buscarRightOuterJoin();
		for (Vendedor vendedor : venderores1) {
			System.out.println(vendedor);
			
		}
		
		System.out.println("Parte II");
		List<Vendedor> venderores11= iVendedorService.buscarRightOuterJoin1(new BigDecimal(2000), new BigDecimal(3000));
		for (Vendedor vendedor : venderores11) {
			System.out.println(vendedor);
			
		}
		
		System.err.println("-----------LEFT JOIN----------");
		List<Vendedor> venderores2= iVendedorService.buscarLeftOuterJoin();
		for (Vendedor vendedor : venderores2) {
			System.out.println(vendedor);	
		}
		System.out.println("Parte II");
		List<Vendedor> venderores22= iVendedorService.buscarLeftOuterJoin1(new BigDecimal(2000));
		for (Vendedor vendedor : venderores22) {
			System.out.println(vendedor);
			
		}
		
		
		System.err.println("-----------LEFT JOIN CLIENTES----------");
		List<Cliente> clientes= iVendedorService.buscarClienteLeftOuterJoin();
		for (Cliente c : clientes) {
			System.out.println(c);
			
		}
		System.out.println("Parte II");
		List<Cliente> clientes1= iVendedorService.buscarClienteLeftOuterJoin1(LocalDateTime.now());
		for (Cliente c : clientes1) {
			System.out.println(c);
			
		}
		
		
		System.err.println("-----------FULL JOIN----------");
		List<Vendedor> venderores3= iVendedorService.buscarFullJoin();
		for (Vendedor vendedor : venderores3) {
			System.out.println(vendedor);
			
		}
		System.out.println("Parte II");
		List<Vendedor> venderores33= iVendedorService.buscarFullJoin1(30);
		for (Vendedor vendedor : venderores33) {
			System.out.println(vendedor);
			
		}
		
		System.err.println("-----------JOIN WHERE----------");
		List<Vendedor> venderores4= iVendedorService.buscarJoinWhere();
		for (Vendedor vendedor : venderores4) {
			System.out.println(vendedor);
			
		}
		
		System.out.println("Parte II");
		List<Vendedor> venderores44= iVendedorService.buscarJoinWhere1("1234566");
		for (Vendedor vendedor : venderores44) {
			System.out.println(vendedor);
			
		}
		
		System.err.println("-----------JOIN FETCH----------");
		List<Vendedor> venderores5= iVendedorService.buscarJoinFetch();
		for (Vendedor vendedor : venderores5) {
			System.out.println(vendedor);
			System.out.println("Sus clientes son:");
			for (Cliente cli : vendedor.getClientes()) {
				System.out.println(cli);
			}
		
			
		}
		
		
		System.out.println("Parte II");
		List<Vendedor> venderores6= iVendedorService.buscarJoinFetch1(new BigDecimal(3000));
		for (Vendedor vendedor : venderores6) {
			System.out.println(vendedor);
			System.out.println("Sus Clientes son:");
			for (Cliente cli : vendedor.getClientes()) {
				System.out.println(cli);
			}	
		}
		
	
		
		
		
		
		
	}

}
