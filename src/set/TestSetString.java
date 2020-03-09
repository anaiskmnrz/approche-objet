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

		Iterator<String> iterator = set.iterator();
	}

}
