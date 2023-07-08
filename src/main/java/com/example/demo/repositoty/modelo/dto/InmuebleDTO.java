package com.example.demo.repositoty.modelo.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class InmuebleDTO {
	
	
	private String tipo;
	private BigDecimal precio;
	private LocalDateTime fecha;
	private String descripcion;
	
	public InmuebleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public InmuebleDTO(String tipo, BigDecimal precio) {
		// TODO Auto-generated constructor stub
		super();
		this.tipo= tipo;
		this.precio= precio;
		
	}
	
	
	public InmuebleDTO(String tipo,BigDecimal precio,LocalDateTime fecha, String descripcion) {
		// TODO Auto-generated constructor stub
		super();
		this.tipo= tipo;
		this.precio= precio;
		this.fecha=fecha;
		this.descripcion= descripcion;
		
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "InmuebleDTO [tipo=" + tipo + ", precio=" + precio + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ "]";
	}
	
	
	
	
	
	

}
