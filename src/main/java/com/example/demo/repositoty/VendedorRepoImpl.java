package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repositoty.modelo.Vendedor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VendedorRepoImpl implements IVendedorRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		entityManager.persist(vendedor);
	}

	@Override
	public int actualizarNombre(String nombre, String apellido, Integer edad, String genero, BigDecimal IntervalSalarioMin,BigDecimal IntervalSalarioMax) {
		// TODO Auto-generated method stub
		Query query= this.entityManager.createQuery("UPDATE Vendedor v SET v.edad= :edad WHERE (v.genero= :genero AND v.apellido= :apellido AND v.nombre= :nombre ) OR   (v.salario>= :IntervalSalarioMin AND  v.salario< :IntervalSalarioMax) ");
		query.setParameter("nombre", nombre);
		query.setParameter("apellido", apellido);
		query.setParameter("edad", edad);
		query.setParameter("genero", genero);
		query.setParameter("IntervalSalarioMin", IntervalSalarioMin);
		query.setParameter("IntervalSalarioMax", IntervalSalarioMax);
		
		return query.executeUpdate();
	}

	@Override
	public int eliminarPorNombreyApellido(String nombre, String apellido, Integer edad, String genero) {
		// TODO Auto-generated method stub
		Query query= this.entityManager.createQuery("DELETE FROM Vendedor v  WHERE (v.apellido= :apellido AND v.nombre= :nombre) OR (v.genero= :genero AND  v.edad> :edad)");
		query.setParameter("nombre", nombre);
		query.setParameter("apellido", apellido);
		query.setParameter("edad", edad);
		query.setParameter("genero", genero);
		
		return query.executeUpdate();
	}
	
	
	public List<Vendedor> seleccionarTodosPorNombreDTO(String nombre){
		
		
		return null;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
