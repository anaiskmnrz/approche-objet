/**
 * 
 */
package fr.diginamic.operations;

import fr.diginamic.maison.Piece;

/** Représentation du calcul d'une moyenne
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CalculMoyenne {

	/** tableau où vont être stockés les nombres pour la moyenne **/
	private double[] tableau;

	/**
	 * @param nouveau nouveau nombre à ajouter dans tableau
	 */
	public void ajout(double nouveau) {
		
		int tableau_length = tableau.length; 
		double[] tableauCopy = new double[tableau_length + 1];
		for (int i = 0; i < tableau_length ; ++i) {
			tableauCopy[i] = tableau[i];
		}
		tableau = tableauCopy; 	
		
		tableau[tableau.length-1] = nouveau;
	}
	
	/**
	 * @return la moyenne des nombres dans tableau
	 */
	public double moyenne() {
		
		double moyenne = 0;
		for (int i = 0; i < tableau.length; ++i) {
			moyenne += tableau[i];
		}
		return moyenne/tableau.length;
	}
	
	/** Constructeur
	 *
	 */
	public CalculMoyenne() {
		tableau = new double[0];
	}


	/** Getter
	 *
	 * @return the tableau
	 */
	public double[] getTableau() {
		return tableau;
	}

	/** Setter
	 *
	 * @param tableau the tableau to set
	 */
	public void setTableau(double[] tableau) {
		this.tableau = tableau;
	}
	
	
	
}
