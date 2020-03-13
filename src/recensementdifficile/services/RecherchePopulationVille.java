/**
 * 
 */
package recensementdifficile.services;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		String nomVille = scanner.nextLine();
		for (Ville ville : recensement.getRecensement()) {
			if (ville.getNomCommune().equals(nomVille)) {
				System.out.println("Population de " + nomVille + " : " + ville.getPopulationTotale());
			}
		}
	}

}
