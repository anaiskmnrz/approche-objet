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
	
	public CompteTaux(int numero, double solde, double tauxRemuneration) {
		super(numero, solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public String toString() {
		String id = super.toString();
		return id + ", Taux de rémunération = " + tauxRemuneration + "%";
	}

}
