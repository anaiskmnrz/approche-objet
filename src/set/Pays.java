/**
 * 
 */
package set;

/** Représentation d'un pays
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Pays {

	/** nom du pays **/
	private String nom;
	/** nombre d'habitants du pays **/
	private int nbHabitants;
	/** pib par habitant du pays **/
	private int pibHabitant;
	
	/**
	 * @return le PIB total du pays
	 */
	public long getPibTotal() {
		return (long) nbHabitants * (long)pibHabitant; 
	}
	
	@Override
	public String toString() {
		return nom + ", nombre d'habitants : " + nbHabitants + ", pib total : " + getPibTotal();
	}
	
	/** Constructeur
	 *
	 * @param nom 			nom du pays
	 * @param nbHabitants 	nombre d'habitants du pays
	 * @param pibHabitant 	pib par habitant
	 */
	public Pays(String nom, int nbHabitants, int pibHabitant) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibHabitant = pibHabitant;
	}

	/** Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 *
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 *
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/** Getter
	 *
	 * @return the pib
	 */
	public int getPibHabitant() {
		return pibHabitant;
	}

	/** Setter
	 *
	 * @param pib the pib to set
	 */
	public void setPibHabitant(int pibHabitant) {
		this.pibHabitant = pibHabitant;
	}
	
	
	
	
}
