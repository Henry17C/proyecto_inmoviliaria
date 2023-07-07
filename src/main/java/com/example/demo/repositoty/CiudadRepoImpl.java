package com.example.demo.repositoty;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.repositoty.modelo.Ciudad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadRepoImpl implements ICiudadRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Ciudad ciudad) {
		// TODO Auto-generated method stub
		entityManager.persist(ciudad);
	}

	@Override
	public Ciudad buscar(String nombre, String cabezeraCantonal, Integer catidadHabitantes, BigDecimal salarioPromedio,
			Double edadPromedio) {
	

				//0. declara un constructor
				CriteriaBuilder mybuilder= this.entityManager.getCriteriaBuilder();
				//1
				CriteriaQuery< Ciudad> myCriteriaQuery= mybuilder.createQuery(Ciudad.class);
				//2
				Root<Ciudad> mitablaFrom= myCriteriaQuery.from(Ciudad.class);//FROM ciudad
				//3 costruccion de condiciones
			
				Predicate pNombre = mybuilder.equal(mitablaFrom.get("nombre"), nombre);
				Predicate pCabezeraCantonal = mybuilder.equal(mitablaFrom.get("cabezeraCantonal"), cabezeraCantonal);
				Predicate pCantidadHabitantes = mybuilder.greaterThan(mitablaFrom.get("catidadHabitantes"), catidadHabitantes);
				Predicate pEdadPromedio = mybuilder.equal(mitablaFrom.get("edadPromedio"), edadPromedio);

				Predicate predicadoFinal=null;
				
				if(salarioPromedio.compareTo(new BigDecimal(400))<=0) {
					predicadoFinal=mybuilder.or(pNombre,pCabezeraCantonal);

				}else {
					predicadoFinal=mybuilder.and(pCantidadHabitantes,pEdadPromedio);

				}
		
				//4. vamos a armar el sql final 
				myCriteriaQuery.select(mitablaFrom).where(predicadoFinal);
				//puedo pasarle u obj criteria query

				//5. la ejecucion de query la realizamos con typedQuery
				TypedQuery<Ciudad> queryFinal= this.entityManager.createQuery(myCriteriaQuery);



				return queryFinal.getSingleResult();
	}

}
