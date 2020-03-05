/**
 * 
 */
package fr.diginamic.formes;

/** Représentation d'un rectangle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Rectangle extends Forme {

	private double largeur;
	private double longueur;
	
	@Override
	public double calculerSurface() {
		return largeur * longueur;
	}

	@Override
	public double calculerPerimetre() {
		return (largeur + longueur) * 2;
	}

	
	/** Constructeur
	 *
	 * @param largeur	largeur du rectangle
	 * @param longueur	longueur du rectangle
	 */
	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	/** Getter
	 *
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 *
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/** Getter
	 *
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/** Setter
	 *
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
