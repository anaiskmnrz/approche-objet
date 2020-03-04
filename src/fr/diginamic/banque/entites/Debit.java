/**
 * 
 */
package fr.diginamic.banque.entites;

/** Repr�sentation d'un d�bit bancaire 
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "D�bit :  ";
	}

	/*
	@Override
	public String toString() {
		return "D�bit :  " + date + ", " + montant + " euros.";
	}*/
	
}
