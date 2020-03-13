package recensementdifficile.services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Recherche des 10 plus grandes villes de France 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Recherche10Villes extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
		TreeMap<Integer,String> populationVillesTri = new TreeMap<>();
		for (Ville ville : recensement.getRecensement()) {
			String commune = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();
			populationVillesTri.put(pop, commune);
		}

		ArrayList<String> popVillesFINAL = new ArrayList<>();
		popVillesFINAL.addAll(populationVillesTri.values());

		System.out.print("\nles 10 villes les + peuplées de France : (+ grand au + petit) ");
		for (int i = popVillesFINAL.size() - 1; i > popVillesFINAL.size() - 11; --i) {
			System.out.print(popVillesFINAL.get(i) + " ");
		}
		System.out.println("\n");
		
	}

}
