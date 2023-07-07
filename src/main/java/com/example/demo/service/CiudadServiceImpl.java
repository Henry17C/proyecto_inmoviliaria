package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositoty.ICiudadRepo;
import com.example.demo.repositoty.modelo.Ciudad;

@Service
public class CiudadServiceImpl implements ICiudadService {

	@Autowired
	private ICiudadRepo ciudadRepo;
	
	@Override
	public void ingresar(Ciudad ciudad) {
		// TODO Auto-generated method stub
		ciudadRepo.insertar(ciudad);
	}

	@Override
	public Ciudad buscar(String nombre, String cabezeraCantonal, Integer catidadHabitantes, BigDecimal salarioPromedio,
			Double edadPromedio) {
		// TODO Auto-generated method stub
		return ciudadRepo.buscar(nombre, cabezeraCantonal, catidadHabitantes, salarioPromedio, edadPromedio);
	}

}
