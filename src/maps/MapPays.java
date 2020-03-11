/**
 * 
 */
package maps;

import java.util.HashMap;

import set.Pays;

/** Test sur les maps avec Pays 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class MapPays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//instances de Pays
		Pays usa = new Pays("USA", 330_252_859, 62_641);
		Pays france = new Pays("France", 67_063_703, 41_464);
		Pays allemagne = new Pays("Allemagne", 83_042_235, 48_196);
		Pays uk = new Pays("UK", 66_465_641, 42_491);
		Pays italie = new Pays("Italie", 60_494_785, 34_318);
		Pays japon = new Pays("Japon", 126_330_302, 39_287);
		Pays chine = new Pays("Chine", 1_401_501_343, 9_771);
		Pays russie = new Pays("Russie", 146_716_295, 11_289);
		Pays inde = new Pays("Inde", 1_358_408_567, 2_016);
		
		//Creation de la HashMap
		HashMap<String, Pays> map = new HashMap<>();
		map.put("France", france);
		map.put("USA", usa);
		map.put("Allemagne", allemagne);
		map.put("UK", uk);
		map.put("Italie", italie);
		map.put("Japon", japon);
		map.put("Chine", chine);
		map.put("Russie", russie);
		map.put("Inde", inde);
		
		//Recherche et suppression du pays qui a le moins d'habitants
		String nomPays = null;
		int nbHab = Integer.MAX_VALUE;
		for (Pays pays : map.values()) {
			if (pays.getNbHabitants() < nbHab) {
				nbHab = pays.getNbHabitants();
				nomPays = pays.getNom();
			}
		}
		map.remove(nomPays);
		
		// Affichage des pays restants
		System.out.print("Voici les pays restants : ");
		for (Pays pays : map.values()) {
			System.out.println(pays);
		}
		/*for (String pays : map.keySet()) {
			System.out.print(pays + " ");
		}*/
		

	}

}
