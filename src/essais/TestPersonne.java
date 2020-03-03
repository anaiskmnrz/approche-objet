package essais;
import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		
		AdressePostale a1 = new AdressePostale();
		
		a1.numeroRue = 99;
		a1.libelleRue = "rue des lilas";
		a1.codePostal = 59000;
		a1.ville = "Lille";
		
		p1.nom = "kominiarz";
		p1.prenom = "anaïs";
		p1.adresse = a1;
		
		
		p2.nom = "dupont";
		p2.prenom = "etienne";
		p2.adresse = new AdressePostale();
		
		/* 2e méthode pour l'adresse. */
		p2.adresse.numeroRue = 101;
		p2.adresse.libelleRue = "rue des cocquelicots";
		p2.adresse.codePostal = 59000;
		p2.adresse.ville = "Lille";
		
	}

}
