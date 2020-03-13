/**
 * 
 */
package recensementdifficile.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import recensementdifficile.Recensement;
import recensementdifficile.Regions;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Recherche10Regions extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
				/*HashMap<String, Integer> populationRegions = new HashMap<>();
				
				for (Ville ville : recensement.getRecensement()) {
					String region = ville.getNomRegion();
					Integer pop = ville.getPopulationTotale();
					
					if (populationRegions.containsKey(region)) {
						pop += populationRegions.get(region);
					}
					populationRegions.put(region, pop);
					
				}*/
		
				Regions regions = new Regions(recensement);
				HashMap<String, Integer> populationRegions = regions.getPopulationRegions();
			

				TreeMap<Integer, String> popRegionsTri = new TreeMap<>();
				Iterator<String> keysIteRegions = populationRegions.keySet().iterator();
				while (keysIteRegions.hasNext()) {
					String next = keysIteRegions.next();
					popRegionsTri.put(populationRegions.get(next), next);
				}

				ArrayList<String> popRegionsFINAL = new ArrayList<>();
				popRegionsFINAL.addAll(popRegionsTri.values());

				System.out.print("\nles 10 régions les + peuplées de France : (+ grand au + petit) ");
				for (int i = popRegionsFINAL.size() - 1; i > popRegionsFINAL.size() - 11; --i) {
					System.out.print(popRegionsFINAL.get(i) + " ");
				}
				System.out.println("\n");
		
	}

	
}
