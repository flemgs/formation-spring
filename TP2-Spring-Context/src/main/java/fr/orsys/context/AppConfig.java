package fr.orsys.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(initMethod="gestionCache", destroyMethod="clearCache")
	public Developpeur developpeur() {
		Developpeur dev = new Developpeur();
		return dev;
	}
	
	@Bean
	public SocieteDevLogiciel societeDevLogiciel() {
		SocieteDevLogiciel societe = new SocieteDevLogiciel();
		societe.setNomSociete("societe java");
		societe.setDeveloppeur(developpeur());
		return societe;
	}
}
