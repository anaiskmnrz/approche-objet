/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.formes.Forme;

/** Représentation de l'affichage des formes
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class AffichageForme {

	 /*cette classe possède une méthode afficher.
	 Cette méthode prend en paramètre une variable de type Forme 
	 et affiche le périmètre de la forme ainsi que sa surface.*/
	
	public static void afficher(Forme forme) {
		System.out.println("Surface : " + forme.calculerSurface() + "\nPérimètre : " + forme.calculerPerimetre());
	}
}
