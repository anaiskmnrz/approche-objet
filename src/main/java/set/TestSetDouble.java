/**
 * 
 */
package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/** Test d'un set de doubles
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestSetDouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.addAll(Arrays.asList(1.5,8.25,-7.32,13.3,-12.45,48.5,0.01));
		
		for (Double nb : set) {
			System.out.println(nb);
		}
		
		double max = 0;
		Iterator<Double> iterator = set.iterator(); 
		while (iterator.hasNext()) { 
			Double myDouble = iterator.next(); 
			if (myDouble >= max) {
				max = myDouble; 
			}
		}
		System.out.println("max = " + max);
		
		double min = 0;
		Iterator<Double> iterator2 = set.iterator(); 
		while (iterator2.hasNext()) { 
			Double myDouble = iterator2.next(); 
			if (myDouble <= max) {
				min = myDouble; 
			}
		}
		set.remove(min);
	
		for (Double nb : set) {
			System.out.print(nb + " ");
		}
	
	}
	
	
	
	

}
