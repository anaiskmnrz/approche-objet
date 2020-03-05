package fr.diginamic.chaines;
import entites.Personne;
import fr.diginamic.banque.entites.Compte;

/** Manipulation de chaînes de caractères 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;012543;1 523.5";
		
		System.out.println("Premier caractère : " + chaine.charAt(0));
		System.out.println("Longueur de la chaîne : " + chaine.length());
		System.out.println("Index du premier ';' : " + chaine.indexOf(';'));
		System.out.println("Nom de famille : " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')));
		System.out.println("Nom de famille en majuscules : " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toUpperCase());
		System.out.println("Nom de famille en minuscules : " + chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toLowerCase());
		
		String[] tab = new String[4];
		tab = chaine.split(";");
		for (int i = 0; i < tab.length; ++i) {
			System.out.println(tab[i]);
		}
		
		Personne p = new Personne(tab[0], tab[1]);
		Compte c  = new Compte(Integer.valueOf(tab[2]), Double.parseDouble(tab[3].replace(" ", "")));
		System.out.println(p.nom + " " + p.prenom);
		System.out.println(c);
		
	}
}
