/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.maison.*;

/** Test de la création d'une maison
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestMaison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	Piece[] tabPieces = new Piece[0];
	Maison m1 = new Maison(tabPieces);
	
	Cuisine c1 = new Cuisine(tabPieces, 10, 0);
	Salon s1 = new Salon(tabPieces, 25, 0);
	WC w1 = new WC(tabPieces, 5, 0);
	Chambre ch1 = new Chambre(tabPieces, 13, 1);
	SalleDeBain sdb1 = new SalleDeBain(tabPieces, 8, 1);
	
	m1.ajouterPiece(c1);
	System.out.println("length = " +tabPieces.length);
	m1.ajouterPiece(ch1);
	m1.ajouterPiece(w1);
	m1.ajouterPiece(s1);
	m1.ajouterPiece(sdb1);
	
	System.out.println("length = " + tabPieces.length);

	}

}
