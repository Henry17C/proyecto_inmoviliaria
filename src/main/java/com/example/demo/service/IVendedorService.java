package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.repositoty.modelo.Cliente;
import com.example.demo.repositoty.modelo.Vendedor;

public interface IVendedorService {

	public void registrar( Vendedor vendedor);
	public  int actualizarNombre(String nombre, String apelligo, Integer edad, String genero, BigDecimal salario, BigDecimal IntervalSalarioMax);
	public  int borrarPorNombreyApellido(String nombre, String apelligo, Integer edad, String genero);
	
	
	public List<Vendedor> buscarLeftOuterJoin();
	public List<Cliente> buscarClienteLeftOuterJoin();
	public List<Vendedor> buscarRightOuterJoin();
	public List<Vendedor> buscarFullJoin();
	public List<Vendedor> buscarJoinWhere();
	
	
	public List<Vendedor> buscarLeftOuterJoin1(BigDecimal salario);
	public List<Cliente> buscarClienteLeftOuterJoin1(LocalDateTime fechaNacimiento);
	public List<Vendedor> buscarRightOuterJoin1( BigDecimal salarioClie,  BigDecimal salarioVend);
	public List<Vendedor> buscarFullJoin1(Integer edad);
	public List<Vendedor> buscarJoinWhere1(String cedulaVend);
	public List<Vendedor> buscarJoinFetch();
	public List<Vendedor> buscarJoinFetch1(BigDecimal salarioClie);

	
}
