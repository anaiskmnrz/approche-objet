/**
 * 
 */
package fr.diginamic.maison;

/** Représentation d'une pièce
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Piece extends Maison {

	/** superficie de la pièce **/
	private double superficie;
	/** etage où se situe la pièce (0 correspondant au RDC) **/
	private int etage;
	
	/** Constructeur
	 *
	 * @param tableauPiece
	 * @param superficie
	 * @param etage
	 */
	public Piece(Piece[] tableauPiece, double superficie, int etage) {
		super(tableauPiece);
		this.superficie = superficie;
		this.etage = etage;
	}
	
	/** Getter
	 *
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/** Setter
	 *
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/** Getter
	 *
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}

	/** Setter
	 *
	 * @param etage the etage to set
	 */
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
}
