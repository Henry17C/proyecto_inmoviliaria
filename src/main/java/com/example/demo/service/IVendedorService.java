package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repositoty.modelo.Vendedor;

public interface IVendedorService {

	public void registrar( Vendedor vendedor);
	public  int actualizarNombre(String nombre, String apelligo, Integer edad, String genero, BigDecimal salario, BigDecimal IntervalSalarioMax);
	public  int borrarPorNombreyApellido(String nombre, String apelligo, Integer edad, String genero);
	
	
}
