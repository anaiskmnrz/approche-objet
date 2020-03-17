/**
 * 
 */
package recensementdifficile.services;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.recensement.Ville;
import recensementdifficile.NomVilleException;
import recensementdifficile.Recensement;

/** Recherche de la population d'une ville
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class RecherchePopulationVille extends MenuService{

	@Override
	public void traiter(Recensement recensement, Scanner scanner) throws NomVilleException {
		String nomVille = scanner.nextLine();
		/*if (!(nomVille instanceof recensement.getRecensement())) {
			throw new NomVilleException("Ce n'est pas une chaîne de caractères.");
		}*/
		int ville;
		ArrayList<Ville> liste = recensement.getRecensement();
		for (ville = 0; ville < liste.size(); ++ville) {
			if (liste.get(ville).getNomCommune().equals(nomVille)) {
				System.out.println("Population de " + nomVille + " : " + liste.get(ville).getPopulationTotale() + " habitants");
				break;
			}	
		}
		System.out.println(liste.size());
		System.out.println(ville);
		if (ville == liste.size()) {
			System.out.println("hey");
			throw new NomVilleException("Cette ville n'existe pas.");
		}
	}

}
