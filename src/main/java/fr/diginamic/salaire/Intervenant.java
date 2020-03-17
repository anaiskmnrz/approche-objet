/**
 * 
 */
package fr.diginamic.salaire;

/** Représentation d'un intervenant
 *
 * @author KOMINIARZ Anaïs
 *
 */
public abstract class Intervenant {
	
	/** nom de l'intervenant **/
	private String nom;
	/** prenom de l'intervenant **/
	private String prenom;
	
	/**
	 * @return le montant du salaire annuel
	 */
	public abstract double getSalaire();
	/**
	 * @return le type de l'intervenant
	 */
	public abstract String getType();

	
	
	/**
	 * affiche les données d'un intervenant
	 */
	public void afficherDonnees() {
		System.out.println("Prenom : "+ prenom + "\nNom : " + nom + "\nSalaire mensuel : " + getSalaire() + "\n" + getType() + "\n");
	}
	
	/** Constructeur
	 *
	 * @param nom 		nom de l'intervenant
	 * @param prenom 	prenom de l'intervenant
	 */
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
}
