/**
 * 
 */
package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import set.Pays;

/** Test de comparable et comparator
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pays usa = new Pays("USA", 330_252_859, 62_641);
		Pays france = new Pays("France", 67_063_703, 41_464);
		Pays allemagne = new Pays("Allemagne", 83_042_235, 48_196);
		Pays uk = new Pays("UK", 66_465_641, 42_491);
		Pays italie = new Pays("Italie", 60_494_785, 34_318);
		Pays japon = new Pays("Japon", 126_330_302, 39_287);
		Pays chine = new Pays("Chine", 1_401_501_343, 9_771);
		Pays russie = new Pays("Russie", 146_716_295, 11_289);
		Pays inde = new Pays("Inde", 1_358_408_567, 2_016);
		
		ArrayList<Pays> liste = new ArrayList<>(Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));
		
		//avec comparable
		//Collections.sort(liste);
		/*for (Pays pays : liste) {
			System.out.println(pays);
		}*/
		//avec comparator
		Collections.sort(liste, new ComparatorHabitant());
		for (Pays pays : liste) {
			System.out.println(pays);
		}
		System.out.println("\n");
		
		Collections.sort(liste, new ComparatorPibHabitant());
		for (Pays pays : liste) {
			System.out.println(pays);
		}
	}

}
