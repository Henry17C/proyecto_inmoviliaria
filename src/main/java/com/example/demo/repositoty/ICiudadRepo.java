package com.example.demo.repositoty;

import java.math.BigDecimal;

import com.example.demo.repositoty.modelo.Ciudad;


public interface ICiudadRepo {
	
	public void insertar( Ciudad ciudad);
	public Ciudad buscar(String nombre, String cabezeraCantonal, Integer catidadHabitantes, BigDecimal salarioPromedio, Double edadPromedio );


	
}
