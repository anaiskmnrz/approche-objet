/**
 * 
 */
package tri;

import java.util.Comparator;

import set.Pays;

/** Compare les pays en fonction du nombre d'habitant
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		return o1.getNbHabitants() - o2.getNbHabitants();
	}

}
