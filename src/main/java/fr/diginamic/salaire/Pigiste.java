/**
 * 
 */
package fr.diginamic.salaire;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Pigiste extends Intervenant {

	/** nombre de jours travaillés dans le mois **/
	private double nbJoursTravaillésMois;
	
	/** salaire par jour **/
	private double salaireJour;

	@Override
	public double getSalaire() {
		return nbJoursTravaillésMois * salaireJour;
	}
	
	@Override
	public String getType() {
		return "Pigiste";
	}
	
	/** Constructeur
	 *
	 * @param nom 					nom du pigiste
	 * @param prenom 				prénom du pigiste
	 * @param nbJoursTravaillésMois nombre de jours travaillés dans le mois
	 * @param salaireJour 			salaire par jour
	 */
	public Pigiste(String nom, String prenom, double nbJoursTravaillésMois, double salaireJour) {
		super(nom, prenom);
		this.nbJoursTravaillésMois = nbJoursTravaillésMois;
		this.salaireJour = salaireJour;
	}

	/** Getter
	 *
	 * @return the nbJoursTravaillésMois
	 */
	public double getNbJoursTravaillésMois() {
		return nbJoursTravaillésMois;
	}

	/** Setter
	 *
	 * @param nbJoursTravaillésMois the nbJoursTravaillésMois to set
	 */
	public void setNbJoursTravaillésMois(double nbJoursTravaillésMois) {
		this.nbJoursTravaillésMois = nbJoursTravaillésMois;
	}

	/** Getter
	 *
	 * @return the salaireJour
	 */
	public double getSalaireJour() {
		return salaireJour;
	}

	/** Setter
	 *
	 * @param salaireJour the salaireJour to set
	 */
	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}

	
	
}
