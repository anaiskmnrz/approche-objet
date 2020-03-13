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
public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		String region = scanner.nextLine();
		int populationRegion = 0;
		for (Ville ville : recensement.getRecensement()) {
			if (ville.getNomRegion().equals(region)) {
				populationRegion += ville.getPopulationTotale();
			}
		}
		System.out.println("Population de la région : " + populationRegion);
		
	}

}
