package fr.diginamic.banque;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

/**
 * Test de la classe Compte
 * 
 * @author KOMINIARZ Anaïs
 *
 */
public class TestBanque {

	public static void main(String[] args) {
		
		Compte c1 = new Compte(1, 20000);
		CompteTaux c2 = new CompteTaux(2, 25000, 3.5);
		
		//System.out.println(c1);
		
		/* tabComptes peut contenir des Compte et aussi tout ce qu'il y a en sous-classes et notamment CompteTaux. */
		Compte[] tabComptes = new Compte[2];
		
		tabComptes[0] = c1;
		tabComptes[1] = c2;
		
		double soldeGlobal = 0; 
		
		for (int i = 0; i < 2 ; ++i) {
			System.out.println(tabComptes[i]);
			soldeGlobal += tabComptes[i].getSoldeInitial();
		}
		
		
		System.out.println("solde global = " + soldeGlobal);
		
		/* On constate que c'est une String qui est affichée et non le n° et solde du compte. */
		
		/* Avec la redefinition de toString c'est OK. */
	}

}
