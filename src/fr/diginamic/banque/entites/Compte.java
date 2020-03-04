package fr.diginamic.banque.entites;


/** Représentation d'un compte bancaire
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Compte { 
	
	/** numero de compte **/
	private int numero; 
	/** solde du compte **/
	private int solde;
	
	/** Constructeur
	 * 
	 * @param numero	le numéro de compte
	 * @param solde 	le solde du compte	
	 */
	public Compte(int numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Numéro de compte : " + numero + ", Solde = " + solde + " euros.";
	}
	
}
