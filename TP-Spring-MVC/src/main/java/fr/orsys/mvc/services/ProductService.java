package fr.orsys.mvc.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.orsys.mvc.dao.ProductDao;
import fr.orsys.mvc.dto.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Transactional
	public void add(Product product) {
		productDao.persist(product);
	}
	
	@Transactional
	public void addAll(Collection<Product> products) {
		for(Product product : products) {
			productDao.persist(product);
		}
	}
	
	@Transactional(readOnly=true)
	public List<Product> listAll() {
		return productDao.findAll();
	}
	
	@Transactional
	public void remove(Product product) {
		productDao.deleteProduct(product);
	}
}