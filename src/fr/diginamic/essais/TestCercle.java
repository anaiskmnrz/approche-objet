/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;


/** Test de l'instance Cercle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestCercle {
	
	public static void main(String[] args) {
		
		System.out.println("--- Exercice Cercle ---");
		Cercle c1 = new Cercle(2.5);
		Cercle c2 = new Cercle(3);
		
		System.out.println("Périmètre d'un cercle de rayon "+ c1.getRayon() + " : " + c1.perimetre());
		System.out.println("Surface d'un cercle de rayon "+ c1.getRayon() + " :   " + c1.surface());
		System.out.println("Périmètre d'un cercle de rayon "+ c2.getRayon() + " : " + c2.perimetre());
		System.out.println("Surface d'un cercle de rayon "+ c2.getRayon() + " :   " + c2.surface());

		System.out.println("\n--- Exercice CercleFactory ---");
		Cercle c3 = CercleFactory.cercle(6.25);
		
		System.out.println("Périmètre d'un cercle de rayon "+ c3.getRayon() + " : " + c3.perimetre());
		System.out.println("Surface d'un cercle de rayon "+ c3.getRayon() + " :   " + c3.surface());
		
		
				
	}

}
