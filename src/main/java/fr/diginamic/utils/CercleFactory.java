/**
 * 
 */
package fr.diginamic.utils;
import fr.diginamic.entites.Cercle;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CercleFactory {

	/**
	 * @param 	rayon rayon du cercle
	 * @return 	une instance de Cercle
	 */
	public static Cercle cercle(double rayon) {
		return new Cercle(rayon);
	}
}
