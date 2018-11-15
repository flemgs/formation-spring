package fr.orsys.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.orsys.mvc.dto.Product;

@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager em;
	
	public void persist(Product product) {
		em.persist(product);
	}
	
	public List<Product> findAll() {
		return em.createQuery("SELECT p FROM Product p").getResultList();
	}
	
	public void deleteProduct(Product product) {
		em.remove(product);
	}
}