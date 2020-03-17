package recensementdifficile.services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Recherche des 10 villes les plus peupl�es d'une r�gion donn�e  
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Recherche10VillesRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		TreeMap<Integer, String> populationRegion = new TreeMap<>();
		
		String region = scanner.nextLine();
		for (Ville ville : recensement.getRecensement()) {
			String nom = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();
			if (ville.getNomRegion().equals(region)) {
				populationRegion.put(pop, nom);
			}
		}

		ArrayList<String> villesRegion = new ArrayList<>();
		villesRegion.addAll(populationRegion.values());

		System.out.print("les 10 villes les + peupl�es de la r�gion " + region + "(+ peupl�e au - peupl�e) : \n");
		for (int i = villesRegion.size() - 1; i > villesRegion.size() - 11; --i) {
			System.out.println(villesRegion.get(i));
		}
		
	}

	
}
