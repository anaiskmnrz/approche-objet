/**
 * 
 */
package fr.diginamic.entites;

/** Représentation d'un cercle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Cercle {

	/** rayon du cercle **/
	private double rayon;

	/**
	 * @param rayon rayon du cercle
	 * @return le périmètre du cercle
	 */
	public double perimetre() {
		return 2*Math.PI*rayon;
	}
	
	/**
	 * @param rayon du cercle
	 * @return la surface du cercle
	 */
	public double surface() {
		return Math.PI * rayon * rayon; 
	}
	
	
	
	/** Constructeur
	 *
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/** Getter
	 *
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}
	/** Setter
	 *
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	
}
