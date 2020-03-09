/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Arrays;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestListString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.addAll(Arrays.asList("Nice", "Carcassone", "Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"));
		
		String max = liste.get(0);
		for (String ville : liste) {
			if (ville.length() >= max.length()) {
				max = ville;
			}
		}
		System.out.println("Ville avec le nom le + long : " +max + "\n");
		
		for (int i = 0; i < liste.size(); ++i) {
			liste.set(i, liste.get(i).toUpperCase());
		}
		
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i).charAt(0) == 'N') {
				liste.remove(i);
			}
		}
		
		for (String villes : liste) {
			System.out.println(villes);
		}
		

	}

}
