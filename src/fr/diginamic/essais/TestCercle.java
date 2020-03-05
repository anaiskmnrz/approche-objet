/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.entites.Cercle;

/** Test de l'instance Cercle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestCercle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cercle c1 = new Cercle(2.5);
		Cercle c2 = new Cercle(3);
		
		System.out.println("Périmètre d'un cercle de rayon "+ c1.getRayon() + " : " + c1.perimetre());
		System.out.println("Surface d'un cercle de rayon "+ c1.getRayon() + " :   " + c1.surface());
		System.out.println("Périmètre d'un cercle de rayon "+ c2.getRayon() + " : " + c2.perimetre());
		System.out.println("Surface d'un cercle de rayon "+ c2.getRayon() + " :   " + c2.surface());

	}

}
