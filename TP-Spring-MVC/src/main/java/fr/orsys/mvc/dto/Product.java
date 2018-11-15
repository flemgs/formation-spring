package fr.orsys.mvc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Table(name="product_t")
@Entity
public class Product {

	@Id
	private int id;
	
	//@Column(name="name_t")
	private String name;
	
	public Product() {
		
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
