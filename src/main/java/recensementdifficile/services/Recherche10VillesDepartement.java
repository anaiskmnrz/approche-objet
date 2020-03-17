/**
 * 
 */
package recensementdifficile.services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Recherche des 10 villes les plus peupl�es d'un d�partement donn� 
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Recherche10VillesDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		TreeMap<Integer, String> populationDepartement = new TreeMap<>();
		
		
		String departement = scanner.nextLine();
		for (Ville ville : recensement.getRecensement()) {
			String nom = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();
			if (ville.getCodeDepartement().equals(departement)) {
				populationDepartement.put(pop, nom);
			}
		}

		ArrayList<String> villesDepartement = new ArrayList<>();
		villesDepartement.addAll(populationDepartement.values());

		System.out.print("les 10 villes les + peupl�es du d�partement " + departement + " (+ peupl�e au - peupl�e) : \n");
		for (int i = villesDepartement.size() - 1; i > villesDepartement.size() - 11; --i) {
			System.out.println(villesDepartement.get(i));
		}
		
	}

}
