package com.example.demo.repositoty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repositoty.modelo.Cliente;
import com.example.demo.repositoty.modelo.Vendedor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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

	@Override
	public List<Vendedor> seleccionarLeftOuterJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Vendedor> query= this.entityManager.createQuery("SELECT v FROM Vendedor v LEFT JOIN  v.clientes cl ", Vendedor.class);
		
		return query.getResultList();
	}

	@Override
	public List<Cliente> seleccionarClienteLeftOuterJoin() {
		// TODO Auto-generated method stub
TypedQuery<Cliente> query= this.entityManager.createQuery("SELECT cl FROM Vendedor v LEFT JOIN  v.clientes cl ", Cliente.class);
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarRightOuterJoin() {
		// TODO Auto-generated method stub
		TypedQuery<Vendedor> query= this.entityManager.createQuery("SELECT v FROM Vendedor v RIGHT JOIN  v.clientes cl ", Vendedor.class);
		
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarFullJoin() {
		// TODO Auto-generated method stub
TypedQuery<Vendedor> query= this.entityManager.createQuery("SELECT v FROM Vendedor v FULL JOIN  v.clientes cl ", Vendedor.class);
		
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarJoinWhere() {
		TypedQuery<Vendedor> query= this.entityManager.createQuery("SELECT v FROM Vendedor v, Cliente c WHERE v= c.vendedor ", Vendedor.class);
		
		return query.getResultList();
	}

	
	
	
	
	
	
	@Override
	public List<Vendedor> seleccionarLeftOuterJoin1(BigDecimal salario) {
		// TODO Auto-generated method stub
		
		TypedQuery<Vendedor> query= this.entityManager.createQuery("select v from Vendedor v left join v.clientes c where v.salario> :salario", Vendedor.class); 
		query.setParameter("salario", salario);
		return query.getResultList();
	}

	@Override
	public List<Cliente> seleccionarClienteLeftOuterJoin1(LocalDateTime fechaNacimiento) {
		// TODO Auto-generated method stub
		//"select c from Vendedor v join left join v.clientes c where c. LocalDateTime fechaNacimiento<=  :LocalDateTime fechaNacimiento"
		TypedQuery<Cliente> query = this.entityManager.createQuery("select c from Vendedor v left join v.clientes c where c.fechaNacimiento<  :fechaNacimiento", Cliente.class);
		query.setParameter("fechaNacimiento", fechaNacimiento);
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarRightOuterJoin1(BigDecimal salarioClie, BigDecimal salarioVend) {
		// TODO Auto-generated method stub
		//select v from Vendedor v right join v.clientes c where v.salario= :salarioVend and c.salario= :salarioClie
		TypedQuery<Vendedor> query = this.entityManager.createQuery("select v from Vendedor v right join v.clientes c where v.salario= :salarioVend and c.salario= :salarioClie", Vendedor.class);
		query.setParameter("salarioClie", salarioClie);
		query.setParameter("salarioVend", salarioVend);
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarFullJoin1(Integer edad) {
		// TODO Auto-generated method stub
		//select v from Vendedor v full join v.clientes c where v.edad=30 or v.nombre like 'Ja%'
		TypedQuery<Vendedor> query = this.entityManager.createQuery("select v from Vendedor v full join v.clientes c where v.edad= :edad or v.nombre like 'Ja%'",Vendedor.class);
		query.setParameter("edad", edad);
		return query.getResultList();
	}

	@Override
	public List<Vendedor> seleccionarJoinWhere1(String cedulaVend) {
		// TODO Auto-generated method stub
		//"select v from Vendedor v, Cliente c where v= c.vendedor c  and c.cedula= :cedulaVend"
		TypedQuery<Vendedor> query = this.entityManager.createQuery("select v from Vendedor v, Cliente c where v= c.vendedor  and v.cedula= :cedulaVend",Vendedor.class);
		query.setParameter("cedulaVend", cedulaVend);
		return query.getResultList();
	
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
