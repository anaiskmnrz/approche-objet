/**
 * 
 */
package listes;

import java.util.ArrayList;
import java.util.Arrays;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Ville {

	/** nom de la ville **/
	public String nom; 
	/** nombre d'habitants dans la ville **/
	public int nombreHabitants;
	
	
	public static void main(String[] args) {
		
		ArrayList<Ville> liste = new ArrayList<>();
		
		Ville ville1 = new Ville("Nice",343_000);
		Ville ville2 = new Ville("Carcassone",47_800);
		Ville ville3 = new Ville("Narbonne",53_400);
		Ville ville4 = new Ville("Lyon",484_000);
		Ville ville5 = new Ville("Foix",9_700);
		Ville ville6 = new Ville("Pau",77_200);
		Ville ville7 = new Ville("Marseille",850_700);
		Ville ville8 = new Ville("Tarbes",40_600);
		
		liste.addAll(Arrays.asList(ville1,ville2,ville3,ville4,ville5,ville6,ville7,ville8));
		
		int max = ville1.getNombreHabitants();
		String maxVille = ville1.getNom();
		for (Ville ville : liste) {
			if (ville.getNombreHabitants() >= max) {
				max = ville.getNombreHabitants();
				maxVille = ville.getNom();
			}	
		}
		System.out.println("Ville la plus peuplée : " + maxVille);
		
		/*ville la moins peuplée*/
		int index = 0;
		int min = ville1.getNombreHabitants();
		for (int i = 0; i < liste.size(); ++i) {
			if (liste.get(i).getNombreHabitants() <= min) {
				min = liste.get(i).getNombreHabitants();
				index = i;
			}	
		}
		liste.remove(index);
		
		for (Ville ville : liste) {
			if (ville.getNombreHabitants() > 100_000) {
				ville.setNom(ville.getNom().toUpperCase());
			}
		}
		
		for (Ville ville : liste) {
			System.out.println(ville);
		}
	}
	
	@Override
	public String toString() {
		return nom + " " +nombreHabitants;
	}


	/** Constructeur
	 *
	 * @param nom 				nom de la ville
	 * @param nombreHabitants 	nombre d'habitants dans la ville
	 */
	public Ville(String nom, int nombreHabitants) {
		super();
		this.nom = nom;
		this.nombreHabitants = nombreHabitants;
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
	 * @return the nombreHabitants
	 */
	public int getNombreHabitants() {
		return nombreHabitants;
	}


	/** Setter
	 *
	 * @param nombreHabitants the nombreHabitants to set
	 */
	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

}
