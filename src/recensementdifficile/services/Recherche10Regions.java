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

/** Recherche des 10 r�gions les + peupl�es en France
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Recherche10Regions extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		
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

				System.out.print("\nles 10 r�gions les + peupl�es de France (+ peupl�e au - peupl�e) : \n");
				for (int i = popRegionsFINAL.size() - 1; i > popRegionsFINAL.size() - 11; --i) {
					System.out.println(popRegionsFINAL.get(i));
				}
		
	}

	
}
