package com.example.demo.repositoty.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Ciudad {
	
	@Id
	@Column(name = "ciud_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciud")
	@SequenceGenerator(name = "seq_ciud", sequenceName = "seq_ciud", allocationSize = 1)
	private Integer id;
	
	@Column(name = "ciud_nombre")
	private String nombre;
	
	@Column(name = "ciud_cabezeraCantonal")
	private String cabezeraCantonal;
	
	@Column(name = "ciud_catidadHabitantes")
	private Integer catidadHabitantes;
	
	@Column(name = "ciud_salarioPromedio")
	private BigDecimal salarioPromedio;
	
	
	@Column(name = "ciud_edadPromedio")
	private Double edadPromedio;
	
	@OneToMany(mappedBy = "ciudad", fetch = FetchType.LAZY)
	private List<Inmueble> inmuebles;
	
	
	public Double getEdadPromedio() {
		return edadPromedio;
	}

	public void setEdadPromedio(Double edadPromedio) {
		this.edadPromedio = edadPromedio;
	}

	

	
	
	public List<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public void setInmuebles(List<Inmueble> inmuebles) {
		this.inmuebles = inmuebles;
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

	public String getCabezeraCantonal() {
		return cabezeraCantonal;
	}

	public void setCabezeraCantonal(String cabezeraCantonal) {
		this.cabezeraCantonal = cabezeraCantonal;
	}

	public Integer getCatidadHabitantes() {
		return catidadHabitantes;
	}

	public void setCatidadHabitantes(Integer catidadHabitantes) {
		this.catidadHabitantes = catidadHabitantes;
	}

	public BigDecimal getSalarioPromedio() {
		return salarioPromedio;
	}

	public void setSalarioPromedio(BigDecimal salarioPromedio) {
		this.salarioPromedio = salarioPromedio;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", nombre=" + nombre + ", cabezeraCantonal=" + cabezeraCantonal
				+ ", catidadHabitantes=" + catidadHabitantes + ", salarioPromedio=" + salarioPromedio + "]";
	}
	
	
	
	
	
	

}
