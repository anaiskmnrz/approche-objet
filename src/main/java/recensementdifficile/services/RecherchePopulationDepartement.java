package recensementdifficile.services;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Recherche de la population d'un département donné
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		String departement = scanner.nextLine();
		int populationDepartement = 0;
		for (Ville ville : recensement.getRecensement()) {
			if (ville.getCodeDepartement().equals(departement)) {
				populationDepartement += ville.getPopulationTotale();
			}
		}
		System.out.println("Population du département "+ departement + " : " + populationDepartement +  " habitants");
		
	}

	
}
