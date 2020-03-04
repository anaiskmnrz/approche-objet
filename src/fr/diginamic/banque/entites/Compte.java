package fr.diginamic.banque.entites;


/** Repr�sentation d'un compte bancaire
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Compte { 
	
	/** numero de compte **/
	private int numero; 
	/** solde du compte **/
	private int solde;
	
	/** Constructeur
	 * 
	 * @param numero	le num�ro de compte
	 * @param solde 	le solde du compte	
	 */
	public Compte(int numero, int solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Num�ro de compte : " + numero + ", Solde = " + solde + " euros.";
	}
	
}
