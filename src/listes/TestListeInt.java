/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.List;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestListeInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> liste = new ArrayList<>();
		//-1, 5, 7, 3, -2, 4, 8, 5 
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		System.out.print("Elements de la liste = ");
		for (int i = 0; i < liste.size(); ++i) {
			System.out.print(liste.get(i) + " ");
		}
		
		System.out.println("\nTaille = "+ liste.size());
		
		int max = liste.get(0);
		for (int nb : liste) {
			if (nb >= max) {
				max = nb;
			}
		}
		System.out.println("max = " + max);
		
		
		int min = liste.get(0);
		int index = 0;
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i) <= min) {
				min = liste.get(i);
				index = i;
			}
		}
		liste.remove(index);
		
		/*System.out.print("Elements de la liste après suppression = ");
		for (Integer elements : liste) {
			System.out.print(elements + " ");
		}*/
		
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i) < 0) {
				liste.set(i, -liste.get(i));
			}
		}
		
		
		System.out.print("\nElements de la liste finie = ");
		for (Integer elements : liste) {
			System.out.print(elements + " ");
		}
		
	}

}
