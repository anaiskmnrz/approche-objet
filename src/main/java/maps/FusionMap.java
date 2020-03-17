/**
 * 
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;

/** Test de fusion de maps
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class FusionMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Création map1   
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();   
		map1.put(1, "Rouge");   
		map1.put(2, "Vert");   
		map1.put(3, "Orange"); 
		 
		  // Création map2   
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();   
		map2.put(4, "Blanc");   
		map2.put(5, "Bleu");   
		map2.put(6, "Orange"); 
		 

		// Fusion des deux maps en map3
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.putAll(map1);
		map3.putAll(map2);
		
		//Affichage de map3 + sa taille
		Iterator<Integer> iterator = map3.keySet().iterator();
		while(iterator.hasNext()) {
			Integer nb = iterator.next();
			System.out.println(nb + " " + map3.get(nb)  );
		}
		
		System.out.println("\nTaille de la map = " + map3.size());
		
	}
	

}
