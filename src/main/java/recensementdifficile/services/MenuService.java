/**
 * 
 */
package recensementdifficile.services;

import java.util.Scanner;

import recensementdifficile.NomVilleException;
import recensementdifficile.Recensement;

/** Représentation d'un menu de services
 *
 * @author KOMINIARZ Anaïs
 *
 */
public abstract class MenuService {
	
	/**
	 * @param recensement 	recensement contient une liste avec toutes les villes de France
	 * @param scanner		entrée au clavier par l'utilisateur du nom de la ville ou région ou du code département
	 * @throws NomVilleException 
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws NomVilleException;
	

}
