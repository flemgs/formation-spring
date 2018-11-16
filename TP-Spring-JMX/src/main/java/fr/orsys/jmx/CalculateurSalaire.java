package fr.orsys.jmx;

import org.springframework.stereotype.Component;

@Component("calculateur")
public class CalculateurSalaire {

	public static final int MONTANT_AGMENTATION_ANNUELLE = 200;
	
	private int augmentation = MONTANT_AGMENTATION_ANNUELLE;

	public void setAugmentation(int augmentation) {
		this.augmentation = augmentation;
	}
	
	public int getAugmentation() {
		return augmentation;
	}
	
	public void rapportDetailleAugmentation() {
		System.out.println("Nouvelle Augmentation generale des salaires : " + augmentation);
	}	
}
