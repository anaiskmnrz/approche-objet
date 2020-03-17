/**
 * 
 */
package fr.diginamic.testenumeration;

/** Test des énumérations
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestEnumeration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print de toutes le saisons contenues dans enumeration
		for (Saison saison : Saison.values()) {
			System.out.println(saison);
	
		}
		
		// affichage de l'énumération dont le nom est été
		String nom = "ETE";
		/*for (Saison saison : Saison.values()) {
			if(saison.name().equals(nom)) {
				System.out.println(saison.getNumero() + " " +saison.getLibelle());
			}
	
		}*/
		
		System.out.println("\n" + Saison.valueOf(nom)); 
		
		// affichage de l'énumération dont le libellé est Hiver
		String libelle = "Hiver";
		System.out.println("\n" + Saison.getInstance(libelle));
	
	}
}
