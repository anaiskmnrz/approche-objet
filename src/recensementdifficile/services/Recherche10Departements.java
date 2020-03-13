package recensementdifficile.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

import recensementdifficile.Departements;
import recensementdifficile.Recensement;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Recherche10Departements extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
	
				
				Departements departements = new Departements(recensement);
				HashMap<String, Integer> populationDepartements = departements.getPopulationDepartements();

				TreeMap<Integer, String> popDepTri = new TreeMap<>();
				Iterator<String> keysIteDep = populationDepartements.keySet().iterator();
				while (keysIteDep.hasNext()) {
					String next = keysIteDep.next();
					popDepTri.put(populationDepartements.get(next), next);
				}

				ArrayList<String> popDepFINAL = new ArrayList<>();
				popDepFINAL.addAll(popDepTri.values());

				System.out.print("\nles 10 départements les + peuplées de France : (+ grand au + petit) ");
				for (int i = popDepFINAL.size() - 1; i > popDepFINAL.size() - 11; --i) {
					System.out.print(popDepFINAL.get(i) + " ");
				}
				System.out.println("\n");
		
	}

}
