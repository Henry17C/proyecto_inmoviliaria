package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.repositoty.modelo.Ciudad;

public interface ICiudadService {
	
	
	public void ingresar( Ciudad ciudad);
	public Ciudad buscar(String nombre, String cabezeraCantonal, Integer catidadHabitantes, BigDecimal salarioPromedio, Double edadPromedio );

	
	
	

}
