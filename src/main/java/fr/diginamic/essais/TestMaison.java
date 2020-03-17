/**
 * 
 */
package fr.diginamic.essais;

import exceptions.PieceException;
import fr.diginamic.maison.*;

/** Test de la création d'une maison
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestMaison {

	/**
	 * @param args
	 * @throws PieceException 
	 */
	public static void main(String[] args) throws PieceException {
	
	Maison m1 = new Maison();
	
	Cuisine c1 = new Cuisine(10, 0);
	Salon s1 = new Salon(25, 0);
	WC w1 = new WC(5, 0);
	Chambre ch1 = new Chambre(13, 1);
	SalleDeBain sdb1 = new SalleDeBain(8, 1);
	
	m1.ajouterPiece(c1);
	//System.out.println("length = " +tabPieces.length);
	m1.ajouterPiece(ch1);
	m1.ajouterPiece(w1);
	m1.ajouterPiece(s1);
	m1.ajouterPiece(sdb1);
	
	System.out.println("Superficie totale = " + m1.superficieTotale() + "\n");
	System.out.println("Superficie étage 0 = " + m1.superficieEtage(0));
	System.out.println("Superficie étage 1 = " + m1.superficieEtage(1) + "\n");

	try {
		m1.ajouterPiece(null);
	} catch (PieceException e) {
		System.out.println("Voici le message d'erreur affiché : " + e.getMessage());
	}
	try {
		Chambre ch2 = new Chambre(-9,1);
	} catch (PieceException e) {
		System.out.println("Voici le message d'erreur affiché : " + e.getMessage());
	}
	try {
		Chambre ch3 = new Chambre (14,-1);
	} catch (PieceException e) {
		System.out.println("Voici le message d'erreur affiché : " + e.getMessage());
	}

	}
}
