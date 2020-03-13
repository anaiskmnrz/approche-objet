package recensementdifficile;

import java.util.HashMap;

import fr.diginamic.recensement.Ville;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Regions {
	
	//private String codeRegion;
	//private String nomRegion;
	private HashMap<String, Integer> populationRegions; 
	

	public Regions(Recensement recensement) {
		
		for (Ville ville : recensement.getRecensement()) {
			String region = ville.getNomRegion();
			Integer pop = ville.getPopulationTotale();
			
			if (populationRegions.containsKey(region)) {
				pop += populationRegions.get(region);
			}
			populationRegions.put(region, pop);
		}
	}


	/** Getter
	 *
	 * @return the populationRegions
	 */
	public HashMap<String, Integer> getPopulationRegions() {
		return populationRegions;
	}


	/** Setter
	 *
	 * @param populationRegions the populationRegions to set
	 */
	public void setPopulationRegions(HashMap<String, Integer> populationRegions) {
		this.populationRegions = populationRegions;
	}


}
