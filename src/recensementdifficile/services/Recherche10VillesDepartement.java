/**
 * 
 */
package recensementdifficile.services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import fr.diginamic.recensement.Ville;
import recensementdifficile.Recensement;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Recherche10VillesDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		TreeMap<Integer, String> populationDepartement = new TreeMap<>();
		
		//Scanner saisie = new Scanner(System.in);
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

		System.out.print("les 10 villes les + peuplées du département " + departement + " : (+ grand au + petit) ");
		for (int i = villesDepartement.size() - 1; i > villesDepartement.size() - 11; --i) {
			System.out.print(villesDepartement.get(i) + " ");
		}
		System.out.println("\n");
		
	}

}
