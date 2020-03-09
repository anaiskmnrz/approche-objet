/**
 * 
 */
package listes;

import java.util.ArrayList;

/** Test cr�ation d'une ArrayList
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class CreationListe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int nombre = 1; nombre < 101; ++nombre) {
			liste.add(nombre);
		}
		
		System.out.println("Taille de la liste = " + liste.size());
	}

}
