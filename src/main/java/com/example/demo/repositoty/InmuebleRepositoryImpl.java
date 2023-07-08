package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repositoty.modelo.Inmueble;
import com.example.demo.repositoty.modelo.dto.InmuebleDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InmuebleRepositoryImpl implements IInmuebleRepository{

	@PersistenceContext 
	private EntityManager entityManager;
	
	
	@Override
	public void insetar(Inmueble inmueble) {
		// TODO Auto-generated method stub
		entityManager.persist(inmueble);
	}

	@Override
	public List<InmuebleDTO> seleccionarPorPrecioDTO(BigDecimal precio) {
		// TODO Auto-generated method stub
	TypedQuery<InmuebleDTO > query= this.entityManager.createQuery("SELECT NEW com.example.demo.repositoty.modelo.dto.InmuebleDTO(i.tipo, i.precio) FROM Inmueble i WHERE i.precio> :precio  ", InmuebleDTO.class);
	query.setParameter("precio", precio);
		
		return query.getResultList();
	}
	
	public List<InmuebleDTO> seleccionarPorPrecioDTO2(BigDecimal precio) {
		// TODO Auto-generated method stub
	TypedQuery<InmuebleDTO > query= this.entityManager.createQuery("SELECT NEW com.example.demo.repositoty.modelo.dto.InmuebleDTO(i.tipo, i.precio, i.fecha, i.descripcion) FROM Inmueble i WHERE i.precio> :precio  ", InmuebleDTO.class);
	query.setParameter("precio", precio);
		
		return query.getResultList();
	}



}
