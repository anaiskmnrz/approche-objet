/**
 * 
 */
package fr.diginamic.banque;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;


/** Tests sur les op�rations
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class TestOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Operation[] operations = new Operation[4];
		
		operations[0] = new Credit("21 janvier 1987", 5000);
		operations[1] = new Credit("26 d�cembre 2019", 10000);
		operations[2] = new Debit("15 avril 1946", 1500);
		operations[3] = new Debit("8 septembre 2018", 800);
		
		double soldeGlobal = 0;
		
		for (int i = 0; i < operations.length; ++i) {
			/*String type = operations[i].afficherType();
			double montant = operations[i].getMontant();
			System.out.print(type);
			System.out.print(operations[i].getDate() + " ");
			System.out.print(montant + "\n");
			*/
			
			/* utilise toString pour l'affichage. */
			System.out.println(operations[i]);
			
			if (operations[i].afficherType().equals("D�bit :  ")) {
				soldeGlobal -= operations[i].getMontant();
			}
			if (operations[i].afficherType().equals("Cr�dit : ")) {
				soldeGlobal += operations[i].getMontant();
			}
			//System.out.println(operations[i]);
		}
		
		System.out.println("\nSolde global = " + soldeGlobal);

	}

}
