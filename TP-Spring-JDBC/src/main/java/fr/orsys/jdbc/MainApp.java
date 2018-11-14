package fr.orsys.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		System.out.println("----Records Creation----");
//		studentJDBCTemplate.create("Abdessalem", 11);
//		studentJDBCTemplate.create("Aymen", 2);
//		studentJDBCTemplate.create("Imen", 15);
//		studentJDBCTemplate.getStudent(2);
//		studentJDBCTemplate.delete(3);
//		studentJDBCTemplate.update(2, 99);
		studentJDBCTemplate.listStudents();
		
	}

}
