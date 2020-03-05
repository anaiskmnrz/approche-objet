/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.formes.Forme;

/** Repr�sentation de l'affichage des formes
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class AffichageForme {

	 /*cette classe poss�de une m�thode afficher.
	 Cette m�thode prend en param�tre une variable de type Forme 
	 et affiche le p�rim�tre de la forme ainsi que sa surface.*/
	
	public static void afficher(Forme forme) {
		System.out.println("Surface : " + forme.calculerSurface() + "\nP�rim�tre : " + forme.calculerPerimetre());
	}
}
