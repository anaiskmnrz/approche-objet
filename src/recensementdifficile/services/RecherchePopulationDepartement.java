package recensementdifficile.services;

import java.util.Scanner;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Représentation 
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
		System.out.println("Population du département : " + populationDepartement);
		
	}

	
}
