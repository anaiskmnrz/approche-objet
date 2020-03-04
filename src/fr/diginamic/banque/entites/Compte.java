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
	private double soldeInitial;
	
	/** Constructeur
	 * 
	 * @param numero	le num�ro de compte
	 * @param solde 	le solde du compte	
	 */
	public Compte(int numero, double soldeInitial) {
		this.numero = numero;
		this.soldeInitial = soldeInitial;
	}
	
	@Override
	public String toString() {
		return "Num�ro de compte : " + numero + ", Solde initial = " + soldeInitial + " euros";
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
	public double getSoldeInitial() {
		return soldeInitial;
	}

	/** Setter
	 *
	 * @param solde the solde to set
	 */
	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}
	
}
