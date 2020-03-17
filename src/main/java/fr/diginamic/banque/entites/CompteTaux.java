/**
 * 
 */
package fr.diginamic.banque.entites;

/** Représentation du taux d'un compte
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CompteTaux extends Compte{
	
	/** taux de remuneration du compte **/
	double tauxRemuneration; 
	
	/** Constructeur
	 *
	 * @param numero numéro de compte
	 * @param solde solde du compte
	 * @param tauxRemuneration taux de rémunération du compte
	 */
	public CompteTaux(int numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Taux de rémunération = " + tauxRemuneration + "%";
	}

	/** Getter
	 *
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 *
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
