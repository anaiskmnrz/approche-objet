/**
 * 
 */
package fr.diginamic.salaire;

/** Repr�sentation 
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Pigiste extends Intervenant {

	/** nombre de jours travaill�s dans le mois **/
	private double nbJoursTravaill�sMois;
	
	/** salaire par jour **/
	private double salaireJour;

	@Override
	public double getSalaire() {
		return nbJoursTravaill�sMois * salaireJour;
	}
	
	@Override
	public String getType() {
		return "Pigiste";
	}
	
	/** Constructeur
	 *
	 * @param nom 					nom du pigiste
	 * @param prenom 				pr�nom du pigiste
	 * @param nbJoursTravaill�sMois nombre de jours travaill�s dans le mois
	 * @param salaireJour 			salaire par jour
	 */
	public Pigiste(String nom, String prenom, double nbJoursTravaill�sMois, double salaireJour) {
		super(nom, prenom);
		this.nbJoursTravaill�sMois = nbJoursTravaill�sMois;
		this.salaireJour = salaireJour;
	}

	/** Getter
	 *
	 * @return the nbJoursTravaill�sMois
	 */
	public double getNbJoursTravaill�sMois() {
		return nbJoursTravaill�sMois;
	}

	/** Setter
	 *
	 * @param nbJoursTravaill�sMois the nbJoursTravaill�sMois to set
	 */
	public void setNbJoursTravaill�sMois(double nbJoursTravaill�sMois) {
		this.nbJoursTravaill�sMois = nbJoursTravaill�sMois;
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
