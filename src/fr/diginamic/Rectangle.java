package fr.diginamic;

/** Représentation d'un rectangle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Rectangle implements ObjetGeometrique {

	
	/** longueur du rectangle **/
	public double longueur;
	/** largeur du rectangle**/
	public double largeur; 

	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return (longueur + largeur) * 2;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return longueur * largeur;
	}

	@Override
	public String toString() {
		return "Rectangle\n";
	}
	
	/** Constructeur
	 *
	 * @param longueur 	longueur du rectangle
	 * @param largeur 	largeur du rectangle
	 */
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}
}
