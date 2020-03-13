/**
 * 
 */
package fr.diginamic.recensement;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Ville {

	private String codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	/** Constructeur
	 *
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param populationTotale
	 */
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	@Override
	public String toString() {
		return "code Region : " + codeRegion + "\nnom Region :" + nomRegion + "\ncode Département : " + codeDepartement +
				"\ncode Commune : " + codeCommune + "\nnom Commune : " + nomCommune + "\npopulation totale de la commune : " + populationTotale + "\n";
	}
	
	/*public boolean equals(Object obj) { 
		if (!(obj instanceof Ville)) { 
			return false; 
		}
	Ville other = (Ville)obj;
	return nomRegion.equals(other.getNomRegion());
	}*/

	/** Getter
	 *
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/** Setter
	 *
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/** Getter
	 *
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/** Setter
	 *
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/** Getter
	 *
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/** Setter
	 *
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/** Getter
	 *
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/** Setter
	 *
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/** Getter
	 *
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/** Setter
	 *
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/** Getter
	 *
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/** Setter
	 *
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
}
