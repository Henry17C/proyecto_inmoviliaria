package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.dto.InmuebleDTO;

public interface IInmuebleService {
	
	
	public void registrar(Inmueble inmueble);
	public List<InmuebleDTO> buscarPorPrecioDTO(BigDecimal precio);
	public List<InmuebleDTO> buscarPorPrecioDTO2(BigDecimal precio);


}
