/**
 * 
 */
package set;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Représentation
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// creation du set de pays
		Pays usa = new Pays("USA", 330_252_859, 62_641);
		Pays france = new Pays("France", 67_063_703, 41_464);
		Pays allemagne = new Pays("Allemagne", 83_042_235, 48_196);
		Pays uk = new Pays("UK", 66_465_641, 42_491);
		Pays italie = new Pays("Italie", 60_494_785, 34_318);
		Pays japon = new Pays("Japon", 126_330_302, 39_287);
		Pays chine = new Pays("Chine", 1_401_501_343, 9_771);
		Pays russie = new Pays("Russie", 146_716_295, 11_289);
		Pays inde = new Pays("Inde", 1_358_408_567, 2_016);

		HashSet<Pays> pays = new HashSet<>(
				Arrays.asList(usa, france, allemagne, uk, italie, japon, chine, russie, inde));

		//recherche du pays avec le + grand pib/habitant
		int pibMax = 0;
		String paysPib = null;
		for (Pays listePays : pays) {
			if (listePays.getPibHabitant() > pibMax) {
				pibMax = listePays.getPibHabitant();
				paysPib = listePays.getNom();
			}
		}
		System.out.println("Pays avec le + grand PIB/hab : " + paysPib);

		//recherche du pays avec le + grand pib + mis en MAJ et suppression du pays avec le + petit pib
		long pibMin = Long.MAX_VALUE;
		Pays paysPibMin= null;
		long pibMaxx = 0;
		paysPib = null;
		for (Pays listePays : pays) {
			long pib = listePays.getPibTotal();
			if (pib > pibMaxx) {
				pibMaxx = pib;
				paysPib = listePays.getNom();
			}
			if (pib < pibMin) {
				pibMin = pib;
				paysPibMin = listePays;
			}
		}
		System.out.println("Pays avec le + grand PIB : " + paysPib + "\n");
		paysPibMin.setNom(paysPibMin.getNom().toUpperCase());
		
		System.out.println(paysPibMin + "\n");
		pays.remove(paysPibMin);
		
		
		// affichage des pays avec le nom, le nombre d'habitants et le pib total
		for (Pays listePays : pays) {
			System.out.println(listePays);
		}
		
	}

}
