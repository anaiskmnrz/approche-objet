package recensementdifficile;

import java.util.HashMap;

import fr.diginamic.recensement.Ville;

/** Représentation d'un département
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Departements {

	private HashMap<String, Integer> populationDepartements;
	
	/** Constructeur
	 *
	 * @param nomRegion nom de la région
	 */
	public Departements(Recensement recensement) {

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
