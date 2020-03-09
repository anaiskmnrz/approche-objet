/**
 * 
 */
package fr.diginamic.formes;

/** Repr�sentation 
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Carre extends Rectangle {

	/** longueur du carr� **/
	private double longueur; 
	
	/** Constructeur
	 *
	 * @param largeur 	largeur du carr�
	 * @param longueur 	longueur du carr�
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
