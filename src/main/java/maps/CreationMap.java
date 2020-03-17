/**
 * 
 */
package maps;

import java.util.HashMap;

/** Creation de maps
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CreationMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creation de la HashMap
		HashMap<String,Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid",2015);
		mapSalaires.put("Chantal", 2418);

		// Affichage de sa taille
		System.out.println("Taille de la map : " + mapSalaires.size());
	}

}
