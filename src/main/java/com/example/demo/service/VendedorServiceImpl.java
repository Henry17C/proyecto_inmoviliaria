package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositoty.IVendedorRepo;
import com.example.demo.repositoty.modelo.Cliente;
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

	@Override
	public List<Vendedor> buscarLeftOuterJoin() {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarLeftOuterJoin();
	}

	@Override
	public List<Cliente> buscarClienteLeftOuterJoin() {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarClienteLeftOuterJoin();
	}

	@Override
	public List<Vendedor> buscarRightOuterJoin() {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarRightOuterJoin();
	}

	@Override
	public List<Vendedor> buscarFullJoin() {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarFullJoin();
	}

	@Override
	public List<Vendedor> buscarJoinWhere() {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarJoinWhere();
	}

	@Override
	public List<Vendedor> buscarLeftOuterJoin1(BigDecimal salario) {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarLeftOuterJoin1(salario);
	}

	@Override
	public List<Cliente> buscarClienteLeftOuterJoin1(LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarClienteLeftOuterJoin1(fechaNacimiento);
	}

	@Override
	public List<Vendedor> buscarRightOuterJoin1(BigDecimal salarioClie, BigDecimal salarioVend) {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarRightOuterJoin1(salarioClie, salarioVend);
	}

	@Override
	public List<Vendedor> buscarFullJoin1(Integer edad) {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarFullJoin1(edad);
	}

	@Override
	public List<Vendedor> buscarJoinWhere1(String cedulaVend) {
		// TODO Auto-generated method stub
		return iVendedorRepo.seleccionarJoinWhere1(cedulaVend);
	}

}
