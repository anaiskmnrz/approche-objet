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
	
	Piece[] tableauPieces = new Piece[0];
	Maison m1 = new Maison(tableauPieces);
	
	Cuisine c1 = new Cuisine(tableauPieces, 10, 0);
	Salon s1 = new Salon(tableauPieces, 25, 0);
	WC w1 = new WC(tableauPieces, 5, 0);
	Chambre ch1 = new Chambre(tableauPieces, 13, 1);
	SalleDeBain sdb1 = new SalleDeBain(tableauPieces, 8, 1);
	
	m1.ajouterPiece(c1);
	m1.ajouterPiece(ch1);
	m1.ajouterPiece(w1);
	m1.ajouterPiece(s1);
	m1.ajouterPiece(sdb1);
	
	System.out.println(tableauPieces.length);

	}

}
