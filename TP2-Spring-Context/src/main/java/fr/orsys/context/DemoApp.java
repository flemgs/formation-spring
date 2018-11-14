package fr.orsys.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SOLUTION 1 (XML)
//		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("demo-bean.xml");
//
//		Developpeur dev = (Developpeur) context.getBean("developpeur");
//		System.out.println("Developpeur name " + dev.getNom());
//		System.out.println("Developpeur annee experience " + dev.getAnneesExperience());
//
//		SocieteDevLogiciel societe = (SocieteDevLogiciel) context.getBean("societeDeveloppeur");
//		System.out.println("Societe name " + societe.getNomSociete());
//		System.out.println("Chef Developpeur name " + societe.getChefDeveloppeur().getNom());
		
		// SOLUTION 2 (JAVA)
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Developpeur dev = (Developpeur) context.getBean("developpeur");
		System.out.println("Developpeur 2 nom " + dev.getNom());
		System.out.println("Developpeur 2 annee experience " + dev.getAnneesExperience());
		
		SocieteDevLogiciel societe = (SocieteDevLogiciel) context.getBean("societeDevLogiciel");
		System.out.println("Societe 2 nom " + societe.getNomSociete());
		System.out.println("Developpeur 2 nom " + societe.getDeveloppeur().getNom());
		System.out.println("Are same developpeur: " + (societe.getDeveloppeur() == dev));
		
		context.close();

	}

}
