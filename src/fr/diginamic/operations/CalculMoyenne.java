/**
 * 
 */
package fr.diginamic.operations;

/** Représentation du calcul d'une moyenne
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CalculMoyenne {
	
	public double[] tableau = new double [5];

	public void ajout(int index, double nouveau) {
		tableau[index] = nouveau;
		
		if (index >= tableau.length) {
				double[] arrayCopy = new double[index+1];
				for (int i = 0; i < index ; ++i) {
					arrayCopy[i] = tableau[i];
				}
				tableau = arrayCopy; 	
		}
	}
	
	public double moyenne() {
		
		double moyenne = 0;
		for (int i = 0; i < tableau.length; ++i) {
			moyenne += tableau[i];
		}
		return moyenne/tableau.length;
	}
	/** Constructeur par défaut
	 *
	 */
	public CalculMoyenne() {
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
