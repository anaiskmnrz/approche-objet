/**
 * 
 */
package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/** Test de set de strings
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestSetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde" ));

		String ville = null;
		int nbMax = 0;
		String grandeVille = null; 
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			ville = iterator.next();
			if (ville.length() > nbMax) {
				grandeVille = ville;
				nbMax = ville.length();
			}
		}
		System.out.println("Grande ville = " + grandeVille + "\n");
		set.remove(grandeVille);
		
		for (String ville1 : set) {
			System.out.println(ville1);
		}
	}

}
