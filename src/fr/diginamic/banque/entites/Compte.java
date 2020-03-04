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
	private double solde;
	
	/** Constructeur
	 * 
	 * @param numero	le num�ro de compte
	 * @param solde 	le solde du compte	
	 */
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Num�ro de compte : " + numero + ", Solde = " + solde + " euros";
	}

	/** Getter
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/** Setter
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/** Getter
	 *
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 *
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
