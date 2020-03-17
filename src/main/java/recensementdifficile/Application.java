/**
 * 
 */
package recensementdifficile;

import java.io.IOException;
import java.util.Scanner;

import recensementdifficile.services.Recherche10Departements;
import recensementdifficile.services.Recherche10Regions;
import recensementdifficile.services.Recherche10Villes;
import recensementdifficile.services.Recherche10VillesDepartement;
import recensementdifficile.services.Recherche10VillesRegion;
import recensementdifficile.services.RecherchePopulationDepartement;
import recensementdifficile.services.RecherchePopulationRegion;
import recensementdifficile.services.RecherchePopulationVille;

/**
 * Représentation
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// récupère toutes les villes dans recensement
		Recensement recensement = new Recensement();
		
		//pour l'option 9
		boolean sortir = false;
		// car on a besoin d'un type scanner pour tous les traiter()
		Scanner saisie = null;
		
		while(sortir == false) {
			int option = 0;
			while (option <= 0 || option > 9) {
				//Affichage du menu 
				System.out.println("\n****************************** MENU ******************************");
				System.out.println("1. Population d’une ville donnée."); 
				System.out.println("2. Population d’un département donné.");
				System.out.println("3. Population d’une région donnée.");
				System.out.println("4. Afficher les 10 régions les plus peuplées.");
				System.out.println("5. Afficher les 10 départements les plus peuplés.");
				System.out.println("6. Afficher les 10 villes les plus peuplées d’un département.");
				System.out.println("7. Afficher les 10 villes les plus peuplées d’une région.");
				System.out.println("8. Afficher les 10 villes les plus peuplées de France."); 
				System.out.println("9. Sortir."); 
				System.out.println("*******************************************************************");
				System.out.print("----> Choisissez une option dans le menu en indiquant son numéro : ");
				saisie = new Scanner(System.in);
				option = saisie.nextInt();
			}
		
			// déroulement en fonction de l'option
			switch (option) {
				case 1:
					System.out.println("\nDe quelle ville souhaitez-vous la population ?(1ere lettre en MAJ et le reste en min)");
					Scanner saisie1 = new Scanner(System.in);
					RecherchePopulationVille recherche1 = new RecherchePopulationVille();
				try {
					recherche1.traiter(recensement, saisie1);
				} catch (NomVilleException e) {
					// TODO Auto-generated catch block
					e.getMessage();
				}
					break;
				case 2:
					System.out.println("\nDe quelle département souhaitez-vous la population ?(code du département)");
					Scanner saisie2 = new Scanner(System.in);
					RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
					recherche2.traiter(recensement, saisie2);
					break;
				case 3:
					System.out.println("\nDe quelle région souhaitez-vous la population ?(nom de la région, 1ere lettre en MAJ)");
					Scanner saisie3 = new Scanner(System.in);
					RecherchePopulationRegion recherche3 = new RecherchePopulationRegion();
					recherche3.traiter(recensement, saisie3);
					break;
				case 4:
					Recherche10Regions recherche4 = new Recherche10Regions();
					recherche4.traiter(recensement, saisie);
					break;
				case 5:
					Recherche10Departements recherche5 = new Recherche10Departements();
					recherche5.traiter(recensement, saisie);
					break;
				case 6: 
					System.out.println("\nDe quelle département souhaitez-vous les 10 villes les + peuplées ?(code du département)");
					Scanner saisie6 = new Scanner(System.in);
					Recherche10VillesDepartement recherche6 = new Recherche10VillesDepartement();
					recherche6.traiter(recensement, saisie6);
					break;
				case 7: 
					System.out.println("\nDe quelle région souhaitez-vous les 10 villes les + peuplées ?(nom de la région)");
					Scanner saisie7 = new Scanner(System.in);
					Recherche10VillesRegion recherche7 = new Recherche10VillesRegion();
					recherche7.traiter(recensement, saisie7);
					break;
				case 8:
					Recherche10Villes recherche8 = new Recherche10Villes();
					recherche8.traiter(recensement, saisie);
					break;
				case 9:
					sortir = true;
					break;
			}
		}
	}

}
