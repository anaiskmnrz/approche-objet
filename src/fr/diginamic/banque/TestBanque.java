package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte c1 = new Compte(13515, 20000);
		
		System.out.println(c1);
		
		/* On constate que c'est une String qui est affichée et non le n° et solde du compte. */
	}

}
