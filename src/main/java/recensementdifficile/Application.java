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
 * Repr�sentation
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		// r�cup�re toutes les villes dans recensement
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
				System.out.println("1. Population d�une ville donn�e."); 
				System.out.println("2. Population d�un d�partement donn�.");
				System.out.println("3. Population d�une r�gion donn�e.");
				System.out.println("4. Afficher les 10 r�gions les plus peupl�es.");
				System.out.println("5. Afficher les 10 d�partements les plus peupl�s.");
				System.out.println("6. Afficher les 10 villes les plus peupl�es d�un d�partement.");
				System.out.println("7. Afficher les 10 villes les plus peupl�es d�une r�gion.");
				System.out.println("8. Afficher les 10 villes les plus peupl�es de France."); 
				System.out.println("9. Sortir."); 
				System.out.println("*******************************************************************");
				System.out.print("----> Choisissez une option dans le menu en indiquant son num�ro : ");
				saisie = new Scanner(System.in);
				option = saisie.nextInt();
			}
		
			// d�roulement en fonction de l'option
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
					System.out.println("\nDe quelle d�partement souhaitez-vous la population ?(code du d�partement)");
					Scanner saisie2 = new Scanner(System.in);
					RecherchePopulationDepartement recherche2 = new RecherchePopulationDepartement();
					recherche2.traiter(recensement, saisie2);
					break;
				case 3:
					System.out.println("\nDe quelle r�gion souhaitez-vous la population ?(nom de la r�gion, 1ere lettre en MAJ)");
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
					System.out.println("\nDe quelle d�partement souhaitez-vous les 10 villes les + peupl�es ?(code du d�partement)");
					Scanner saisie6 = new Scanner(System.in);
					Recherche10VillesDepartement recherche6 = new Recherche10VillesDepartement();
					recherche6.traiter(recensement, saisie6);
					break;
				case 7: 
					System.out.println("\nDe quelle r�gion souhaitez-vous les 10 villes les + peupl�es ?(nom de la r�gion)");
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
