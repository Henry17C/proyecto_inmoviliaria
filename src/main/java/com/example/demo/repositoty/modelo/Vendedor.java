package com.example.demo.repositoty.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vend")
	@SequenceGenerator(name = "seq_vend", sequenceName = "seq_vend", allocationSize = 1)
	@Column(name = "vend_id")
	private Integer id;
	
	@Column(name = "vend_nombre")
	private String nombre;
	
	@Column(name = "vend_apellido")
	private String apellido;
	
	@Column(name = "vend_cedula")
	private String cedula;
	
	@Column(name = "vend_genero")
	private String genero;
	
	@Column(name = "vend_edad")
	private Integer edad;
	
	@Column(name = "vend_salario")
	private BigDecimal salario;
	
	
	
	@OneToMany(mappedBy = "vendedor")
	private List<Inmueble> inmuebles;
	
	@OneToMany(mappedBy = "vendedor")
	private List<Cliente> clientes;



	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public BigDecimal getSalario() {
		return salario;
	}



	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}



	public List<Inmueble> getInmuebles() {
		return inmuebles;
	}



	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
	}



	@Override
	public String toString() {
		return "Vendedor [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", genero=" + genero
				+ ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	
	
	   

}
