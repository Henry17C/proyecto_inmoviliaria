package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repositoty.modelo.Vendedor;

public interface IVendedorRepo {

	public void insertar( Vendedor vendedor);
	public  int actualizarNombre(String nombre, String apelligo, Integer edad, String genero, BigDecimal salario, BigDecimal IntervalSalarioMax);
	public  int eliminarPorNombreyApellido(String nombre, String apelligo, Integer edad, String genero);
	public List<Vendedor> seleccionarTodosPorNombreDTO(String nombre);
	
}
