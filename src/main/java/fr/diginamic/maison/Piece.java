/**
 * 
 */
package fr.diginamic.maison;

import exceptions.PieceException;

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
	 * @throws PieceException 
	 */
	public Piece(double superficie, int etage) throws PieceException {
		if (etage < 0 || superficie < 0) {
			throw new PieceException("L'étage ou la superficie ne peuvent pas être négatifs. ");
		} else {
			this.superficie = superficie;
			this.etage = etage;
		}
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
