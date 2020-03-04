/**
 * 
 */
package fr.diginamic.banque.entites;

/** Repr�sentation d'une op�ration bancaire
 *
 * @author KOMINIARZ Ana�s
 *
 */
public abstract class Operation {

	/** date de l'op�ration **/
	private String date; 
	/** montant de l'op�ration **/
	private double montant;
	
	/**
	 * @return le type de l'op�ration bancaire: Cr�dit ou D�bit
	 */
	/* Pour avoir une m�thode g�n�rique d'affichage plac�e dans la classe m�re
	 * avec nos variables qui restent private. */
	public abstract String afficherType();
	

	public String toString() {
		return afficherType() + date + ", " + montant + " euros.";
	}
	
	/** Constructeur
	 *
	 * @param date 		date de l'op�ration
	 * @param montant 	montant de l'op�ration
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
