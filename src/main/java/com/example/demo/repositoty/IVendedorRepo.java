package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repositoty.modelo.Cliente;
import com.example.demo.repositoty.modelo.Vendedor;

public interface IVendedorRepo {

	public void insertar( Vendedor vendedor);
	public  int actualizarNombre(String nombre, String apelligo, Integer edad, String genero, BigDecimal salario, BigDecimal IntervalSalarioMax);
	public  int eliminarPorNombreyApellido(String nombre, String apelligo, Integer edad, String genero);
	public List<Vendedor> seleccionarTodosPorNombreDTO(String nombre);
	
	
	public List<Vendedor> seleccionarLeftOuterJoin();
	public List<Cliente> seleccionarClienteLeftOuterJoin();
	public List<Vendedor> seleccionarRightOuterJoin();
	public List<Vendedor> seleccionarFullJoin();
	public List<Vendedor> seleccionarJoinWhere();
	
	public List<Vendedor> seleccionarLeftOuterJoin1(BigDecimal salario);
	public List<Cliente> seleccionarClienteLeftOuterJoin1( LocalDateTime fechaNacimiento);
	public List<Vendedor> seleccionarRightOuterJoin1( BigDecimal salarioClie,  BigDecimal salarioVend);
	public List<Vendedor> seleccionarFullJoin1(Integer edad);
	public List<Vendedor> seleccionarJoinWhere1(String cedulaVend);
	
	
	
	
	
	
	
}
