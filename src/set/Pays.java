/**
 * 
 */
package set;

import java.text.DecimalFormat;

/** Représentation d'un pays
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Pays implements Comparable<Pays>{

	/** nom du pays **/
	private String nom;
	/** nombre d'habitants du pays **/
	private int nbHabitants;
	/** pib par habitant du pays **/
	private int pibHabitant;

	
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
	
	/**
	 * @return le PIB total du pays
	 */
	public long getPibTotal() {
		return (long) nbHabitants * (long)pibHabitant; 
	}
	
	@Override
	public boolean equals(Object object) { 
		if (!(object instanceof Pays)) {
		return false;
		} 
		Pays other = (Pays) object;
		return nom.equals(other.getNom());
		}
	
	@Override
	public int compareTo(Pays pays2) {
		// tri par nom
		//return this.nom.compareTo(pays2.getNom()); 
		//tri par pib/hab
		return pibHabitant - pays2.getPibHabitant();
	}
	
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,##0");
		return nom + ", nombre d'habitants : " + formatter.format(nbHabitants) + ", pib/hab : " + formatter.format(pibHabitant)+  ", pib total : " +formatter.format(getPibTotal());
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
