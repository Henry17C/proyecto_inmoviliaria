package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositoty.IVendedorRepo;
import com.example.demo.repositoty.modelo.Vendedor;

@Service
public class VendedorServiceImpl implements IVendedorService {

	@Autowired
	private IVendedorRepo iVendedorRepo;
	
	
	@Override
	public void registrar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		iVendedorRepo.insertar(vendedor);
	}

	@Override
	public int actualizarNombre(String nombre, String apelligo, Integer edad, String genero, BigDecimal salario,
			BigDecimal IntervalSalarioMax) {
		// TODO Auto-generated method stub
		return iVendedorRepo.actualizarNombre(nombre, apelligo, edad, genero, salario, IntervalSalarioMax);
	}

	@Override
	public int borrarPorNombreyApellido(String nombre, String apelligo, Integer edad, String genero) {
		// TODO Auto-generated method stub
		return iVendedorRepo.eliminarPorNombreyApellido(nombre, apelligo, edad, genero);
	}

}
