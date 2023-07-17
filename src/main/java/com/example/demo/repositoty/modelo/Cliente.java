package com.example.demo.repositoty.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table
@Entity
public class Cliente {
	
	@Id
	@Column(name= "clie_id")
	@GeneratedValue(generator = "seq_clie", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1,sequenceName = "seq_clie", name = "seq_clie")
	private Integer id;
	
	@Column(name= "clie_nombre")
	private String nombre;
	
	@Column(name= "clie_apellido")
	private String apellido;
	
	@Column(name= "clie_cedula")
	 private String cedula;
	
	@Column(name= "clie_fecha_nacimiento")
	 private LocalDateTime fechaNacimiento;
	
	@Column(name= "clie_salario")
	 private BigDecimal salario;
	
	@ManyToOne
	@JoinColumn(name = "clie_id_vendedor")
	private Vendedor vendedor;

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", fechaNacimiento=" + fechaNacimiento + ", salario=" + salario + ", vendedor=" + vendedor + "]";
	}

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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	 
	 
	
	
	 
	

}
