package fr.orsys.context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service
public class Developpeur {

	private String nom;
	private int anneesExperience;

	public Developpeur() {
		System.out.println("Developpeur constructor");
	}

	//@PostConstruct
	private void gestionCache() {
		setNom("DRIDIJAVA");
		setAnneesExperience(22);
		System.out.println("gestionCache");
	}
	
	//@PreDestroy
	private void clearCache() {
		System.out.println("clearCache");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnneesExperience() {
		return anneesExperience;
	}

	public void setAnneesExperience(int anneesExperience) {
		this.anneesExperience = anneesExperience;
	}
}
