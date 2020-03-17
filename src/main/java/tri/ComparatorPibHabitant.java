package tri;

import java.util.Comparator;

import set.Pays;

/** Compare les pays en fonction de leur pib/habitant
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		// TODO Auto-generated method stub
		return o1.getPibHabitant() - o2.getPibHabitant();
	}

}
