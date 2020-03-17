package recensementdifficile;

import java.util.HashMap;

import fr.diginamic.recensement.Ville;

/** Représentation de tous les départements de France
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Departements {

	private HashMap<String, Integer> populationDepartements;
	
	
	/** Constructeur
	 *
	 * @param recensement recensement contient une liste avec toutes les villes de France
	 */
	public Departements(Recensement recensement) {

		populationDepartements = new HashMap<>();
		
		for (Ville ville : recensement.getRecensement()) {
			String departement = ville.getCodeDepartement();
			Integer pop = ville.getPopulationTotale();
			if (populationDepartements.containsKey(departement)) {
				pop += populationDepartements.get(departement);
			}
			populationDepartements.put(departement, pop);

		}
	}

	/** Getter
	 *
	 * @return the populationDepartements
	 */
	public HashMap<String, Integer> getPopulationDepartements() {
		return populationDepartements;
	}

	/** Setter
	 *
	 * @param populationDepartements the populationDepartements to set
	 */
	public void setPopulationDepartements(HashMap<String, Integer> populationDepartements) {
		this.populationDepartements = populationDepartements;
	}

}
