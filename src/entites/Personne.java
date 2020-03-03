package entites;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public void Affichage(String nom, String prenom) {
		System.out.println("prenom : " + prenom);
		System.out.println("nom : "+ nom.toUpperCase());
	}
	
	public void ModificationNom(String nouveauNom) {
		nom = nouveauNom; 
	}
	
	public void ModificationPrenom(String nouveauPrenom) {
		prenom = nouveauPrenom; 
	}
	
	public void ModificationAdresse(AdressePostale nouvelleAdresse) {
		adresse = nouvelleAdresse;
	}
	
	public String ReturnNom() {
		return this.nom; //this ou non ? 
	}
	
	public String ReturnPrenom() {
		return this.prenom;
	}
	
	public AdressePostale ReturnAdresse() {
		return this.adresse;
	}
	
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
