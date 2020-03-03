package essais;
import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne p1 = new Personne("kominiarz","anaïs");
		
		//p1.ModificationAdresse(nouvelleAdresse);
		
		p1.Affichage();
		p1.setNom("parsis");
		p1.setAdresse(new AdressePostale(78,"fjdoil",1456,"dskfdsl"));
		p1.Affichage();
		
		
		String nom1 = p1.getNom();
		System.out.println(nom1);
		
		String prenom1 = p1.getPrenom();
		System.out.println(prenom1);
		
		AdressePostale adr1 = p1.getAdresse();
		System.out.println(adr1);
		
		/* TP2
		 * 
		 * Personne p3 = new Personne("kominiarz","anaïs");
		p3.adresse = new AdressePostale(101, "rue des cocquelicots", 59000, "Lille");
		
		AdressePostale a4 = new AdressePostale(99, "rue des lilas", 59000, "Lille");
		Personne p4 = new Personne("dupont", "jean", a4);
		*/
		/* METHODE AVANT LES CONSTRUCTEURS.
		 *  
		*Personne p1 = new Personne();
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
		p2.adresse = new AdressePostale();*/
		
		/* 2e méthode pour l'adresse. */
		/*p2.adresse.numeroRue = 101;
		p2.adresse.libelleRue = "rue des cocquelicots";
		p2.adresse.codePostal = 59000;
		p2.adresse.ville = "Lille";
		*/
		
		
	}

}
