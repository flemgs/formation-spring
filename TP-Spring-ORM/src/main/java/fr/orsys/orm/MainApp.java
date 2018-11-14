package fr.orsys.orm;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		ProductService productService = context.getBean(ProductService.class);
		
//		productService.add(new Product(222802, "Bulb"));
//		productService.add(new Product(12312, "Dijone mustard"));
		
		System.out.println("listAll: " + productService.listAll());
		
		// productService.addAll(Arrays.asList(new Product(333, "book"), new Product(444, "soap"), new Product(1,"computer")));
	
		System.out.println("listAll: " + productService.listAll());
	}
}
