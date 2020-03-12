/**
 * 
 */
package fr.diginamic.testenumeration;

/** Test des �num�rations
 *
 * @author KOMINIARZ Ana�s
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
		
		// affichage de l'�num�ration dont le nom est �t�
		String nom = "ETE";
		/*for (Saison saison : Saison.values()) {
			if(saison.name().equals(nom)) {
				System.out.println(saison.getNumero() + " " +saison.getLibelle());
			}
	
		}*/
		
		System.out.println("\n" + Saison.valueOf(nom)); 
		
		// affichage de l'�num�ration dont le libell� est Hiver
		String libelle = "Hiver";
		System.out.println("\n" + Saison.getInstance(libelle));
	
	}
}
