/**
 * 
 */
package fr.diginamic.formes;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Cercle extends Forme {

	
	private double rayon;

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return Math.PI * rayon * rayon;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return Math.PI * rayon;
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
