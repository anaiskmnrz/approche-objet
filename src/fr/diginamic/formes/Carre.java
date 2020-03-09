/**
 * 
 */
package fr.diginamic.formes;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Carre extends Rectangle {

	/** longueur du carré **/
	private double longueur; 
	
	/** Constructeur
	 *
	 * @param largeur 	largeur du carré
	 * @param longueur 	longueur du carré
	 */
	
	/* Pourquoi juste pas carre(2) ? pcq c'est une extension de rectangle? */
	public Carre(double longueur) {
		super(longueur, longueur);
		this.longueur = longueur;
	}
	
	@Override
	public double calculerPerimetre() {
		return longueur * 4;
	}

	@Override
	public double calculerSurface() {
		return longueur * longueur;
	}
}
