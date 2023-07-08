package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositoty.IInmuebleRepository;
import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.dto.InmuebleDTO;

@Service
public class InmuebleServiceImpl implements IInmuebleService{

	@Autowired
	private IInmuebleRepository iInmuebleRepository;
	
	@Override
	public void registrar(Inmueble inmueble) {
		// TODO Auto-generated method stub
		iInmuebleRepository.insetar(inmueble);
	}

	@Override
	public List<InmuebleDTO> buscarPorPrecioDTO(BigDecimal precio) {
		// TODO Auto-generated method stub
		return iInmuebleRepository.seleccionarPorPrecioDTO(precio);
	}

	@Override
	public List<InmuebleDTO> buscarPorPrecioDTO2(BigDecimal precio) {
		// TODO Auto-generated method stub
		return iInmuebleRepository.seleccionarPorPrecioDTO2(precio);
	}
	
	

}
