/**
 * 
 */
package fr.diginamic.banque.entites;

/** Repr�sentation d'un cr�dit bancaire
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "Cr�dit : ";
	}
	
	/*@Override
	public String toString() {
		return "Cr�dit : " + date + ", " + montant + " euros.";
	}*/

}
