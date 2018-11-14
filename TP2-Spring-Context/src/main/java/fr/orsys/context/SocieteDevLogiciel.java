package fr.orsys.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SocieteDevLogiciel {

	private String nomSociete;
	@Autowired 
	private Developpeur developpeur;
	private Developpeur chefDeveloppeur;

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public Developpeur getDeveloppeur() {
		return developpeur;
	}

	public void setDeveloppeur(Developpeur developpeur) {
		this.developpeur = developpeur;
	}

	public Developpeur getChefDeveloppeur() {
		return chefDeveloppeur;
	}

	public void setChefDeveloppeur(Developpeur chefDeveloppeur) {
		this.chefDeveloppeur = chefDeveloppeur;
	}
}
