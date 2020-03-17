/**
 * 
 */
package fr.diginamic.banque.entites;

/** Représentation d'un crédit bancaire
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Credit extends Operation {

	public Credit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String afficherType() {
		return "Crédit : ";
	}
	
	/*@Override
	public String toString() {
		return "Crédit : " + date + ", " + montant + " euros.";
	}*/

}
