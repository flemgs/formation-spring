package fr.orsys.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService productService = context.getBean(ProductService.class);
		
//		productService.add(new Product(222802, "Bulb"));
//		productService.add(new Product(12312, "Dijone mustard"));
		
		System.out.println("listAll: " + productService.listAll());
		
		// productService.addAll(Arrays.asList(new Product(333, "book"), new Product(444, "soap"), new Product(1,"computer")));
	
		System.out.println("listAll: " + productService.listAll());
	}
}
