package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.dto.InmuebleDTO;

public interface IInmuebleRepository {
	
	
	public void insetar(Inmueble inmueble);
	public List<InmuebleDTO> seleccionarPorPrecioDTO(BigDecimal precio);
	public List<InmuebleDTO> seleccionarPorPrecioDTO2(BigDecimal precio);
	
}
