/**
 * 
 */
package recensementdifficile.services;

import java.util.Scanner;

import recensementdifficile.NomVilleException;
import recensementdifficile.Recensement;

/** Repr�sentation d'un menu de services
 *
 * @author KOMINIARZ Ana�s
 *
 */
public abstract class MenuService {
	
	/**
	 * @param recensement 	recensement contient une liste avec toutes les villes de France
	 * @param scanner		entr�e au clavier par l'utilisateur du nom de la ville ou r�gion ou du code d�partement
	 * @throws NomVilleException 
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws NomVilleException;
	

}
