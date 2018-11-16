package fr.orsys.jmx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CalculateurSalaire myMbean = (CalculateurSalaire) context.getBean("calculateur");

		System.out.println("Augmentation de salaire initiale " + myMbean.getAugmentation() + " euros");

		String nouvelleAugmentation = "";
		do {
			System.out.println("Quelle nouvelle augmentation pour vos salaries ? Entrez 0 pour arreter");
			try {
				nouvelleAugmentation = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			} catch (IOException e) {

				e.printStackTrace();
			}
			myMbean.setAugmentation(Integer.parseInt(nouvelleAugmentation));
		} while (!"0".equals(nouvelleAugmentation));
	}

}
