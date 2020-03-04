package fr.diginamic.banque.entites;

public class Compte {

	private int numCompte; 
	private int soldeCompte;
	
	/**
	 * Constructeur
	 * 
	 * @param numCompte 	le numéro de compte
	 * @param soldeCompte 	le solde du compte	
	 */
	public Compte(int numCompte, int soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	
}
