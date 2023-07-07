package com.example.demo.repositoty.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Inmueble {
	@Id
	@Column(name = "inmv_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inmv")
	@SequenceGenerator(name = "seq_inmv", sequenceName = "seq_inmv", allocationSize = 1)
	private Integer id;
	
	 @Column(name = "inmv_tipo")
	private String tipo;
	 
	 @Column(name = "inmv_precio")
	private BigDecimal precio;
	 
	 @Column(name = "inmv_fecha")
	private LocalDateTime fecha;
	 
	 @Column(name = "inmv_descripcion")
	private String descripcion;
	 
	 
	 @ManyToOne
	 @JoinColumn(name = "inmv_id_vendedor")
	 private Vendedor vendedor;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public Vendedor getVendedor() {
		return vendedor;
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", tipo=" + tipo + ", precio=" + precio + ", fecha=" + fecha + ", descripcion="
				+ descripcion + ", vendedor=" + vendedor + ", getId()=" + getId() + ", getTipo()=" + getTipo()
				+ ", getPrecio()=" + getPrecio() + ", getFecha()=" + getFecha() + ", getDescripcion()="
				+ getDescripcion() + ", getVendedor()=" + getVendedor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
	 
	 
	 
}
