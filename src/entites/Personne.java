package entites;

/**
 * @author 33687
 *
 */
/**
 * @author 33687
 *
 */
/** Représente le concept de Personne
 * @author Anaïs 
 *
 */
public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public void Affichage() {
		System.out.println(prenom + " " + nom.toUpperCase());
	}
	
	/* méthode avec this est la méthode générale, 
	 mais si difficultés peut faire avec ce qu'il y a
	 en commentaires. */
	public void setNom(String nom) {
		this.nom = nom; 
	}
	
	/*public void ModificationNom(String nouveauNom) {
		nom = nouveauNom; 
	}*/
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/*public void ModificationPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom; 
	}*/
	
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	
	
	/*public void ModificationAdresse(AdressePostale nouvelleAdresse) {
		adresse = nouvelleAdresse;
	}*/
	
	/* Changements en set et get pour les standards habituels. */
	
	public String getNom() {
		return nom; 
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @return the adresse. 
	 */
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	/**
	 * Constructeur
	 * 
	 * @param nom 		nom de la personne
	 * @param prenom 	prenom de la personne
	 * @param adresse 	adresse postale de la personne
	 */
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
}
