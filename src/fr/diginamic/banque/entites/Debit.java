/**
 * 
 */
package fr.diginamic.banque.entites;

/** Représentation d'un débit bancaire 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "Débit :  ";
	}

	/*
	@Override
	public String toString() {
		return "Débit :  " + date + ", " + montant + " euros.";
	}*/
	
}
