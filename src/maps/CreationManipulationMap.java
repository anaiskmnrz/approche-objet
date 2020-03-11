/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;

/** Creéation et manipulation de maps
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CreationManipulationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		//Création de la HashMap
		HashMap<Integer, String> mapVilles = new HashMap<>();   
		mapVilles.put(13, "Marseille");   
		mapVilles.put(34, "Montpellier");   
		mapVilles.put(44, "Nantes");  
		mapVilles.put(75, "Paris");   
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// Deux affichages pour les villes et leur département
		System.out.print("Voici les différents départements : ");
		for (Integer nb : mapVilles.keySet()) {
			System.out.print(nb + " ");
		}
		System.out.print("\nVoici les différentes villes : ");
		for (String ville : mapVilles.values()) {
			System.out.print(ville + " ");
		}
		
		// OU 
		System.out.println("\n");
		
		Iterator<Integer> iterator = mapVilles.keySet().iterator();
		while(iterator.hasNext()) {
			Integer dep = iterator.next();
			System.out.println(mapVilles.get(dep) + " " +dep );
		}
		
		// Affichage de la taille de la map
		System.out.println("\nTaille de la map = " + mapVilles.size());
	}

}
