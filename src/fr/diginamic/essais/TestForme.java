/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.formes.*;

/** Teste l'affichage d'une forme
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestForme {

	public static void main(String[] args) {
		
		Forme f1 = new Cercle(2);
		System.out.println("Cercle " );
		AffichageForme.afficher(f1);
		
		Forme f2 = new Rectangle(2,4);
		System.out.println("\nRectangle " );
		AffichageForme.afficher(f2);
		
		Forme f3 = new Carre(2,2);
		System.out.println("\nCarré " );
		AffichageForme.afficher(f3);
	
	}

}
