package fr.orsys.aop.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class DemoApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);
		
		EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
		manager.getEmployeeById(2);

	}

}
