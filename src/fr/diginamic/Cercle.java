/**
 * 
 */
package fr.diginamic;

/** Représentation d'un cercle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Cercle implements ObjetGeometrique {

	/** rayon du cercle **/
	public double rayon;
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return rayon * Math.PI;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return rayon * rayon * Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle\n";
	}
	
	/** Constructeur
	 *
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
}
