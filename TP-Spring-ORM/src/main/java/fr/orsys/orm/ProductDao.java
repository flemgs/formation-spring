package fr.orsys.orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ProductDao {

	@PersistenceContext
	private EntityManager em;
	
	public void persist(Product product) {
		em.persist(product);
	}
	
	public List<Product> findAll() {
		return em.createQuery("select p from Product p").getResultList();
	}
	
	public void deleteProduct(Product product) {
		em.remove(product);
	}
}
