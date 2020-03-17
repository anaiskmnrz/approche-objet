/**
 * 
 */
package fr.diginamic.banque.entites;

/** Représentation d'une opération bancaire
 *
 * @author KOMINIARZ Anaïs
 *
 */
public abstract class Operation {

	/** date de l'opération **/
	private String date; 
	/** montant de l'opération **/
	private double montant;
	
	/**
	 * @return le type de l'opération bancaire: Crédit ou Débit
	 */
	/* Pour avoir une méthode générique d'affichage placée dans la classe mère
	 * avec nos variables qui restent private. */
	public abstract String afficherType();
	

	public String toString() {
		return afficherType() + date + ", " + montant + " euros.";
	}
	
	/** Constructeur
	 *
	 * @param date 		date de l'opération
	 * @param montant 	montant de l'opération
	 */
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	
	/** Getter
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/** Setter
	 *
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/** Getter
	 *
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 *
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
}
