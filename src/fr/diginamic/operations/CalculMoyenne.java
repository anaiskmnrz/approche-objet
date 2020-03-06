/**
 * 
 */
package fr.diginamic.operations;

import fr.diginamic.maison.Piece;

/** Repr�sentation du calcul d'une moyenne
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class CalculMoyenne {
	
	public double[] tableau;

	public void ajout(double nouveau) {
		
		int tableau_length = tableau.length;

		double[] tableauCopy = new double[tableau_length + 1];
		for (int i = 0; i < tableau_length ; ++i) {
			tableauCopy[i] = tableau[i];
		}
		tableau = tableauCopy; 	
		
		tableau[tableau.length-1] = nouveau;
	}
	
	public double moyenne() {
		
		double moyenne = 0;
		for (int i = 0; i < tableau.length; ++i) {
			moyenne += tableau[i];
		}
		return moyenne/tableau.length;
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
