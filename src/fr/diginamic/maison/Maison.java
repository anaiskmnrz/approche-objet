/**
 * 
 */
package fr.diginamic.maison;

/** Représentation de la maison
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Maison {

	private Piece[] tableauPiece;
	
	public void ajouterPiece(Piece piece) {
		
		int tableauPiece_length = tableauPiece.length;

		Piece[] tableauPieceCopy = new Piece[tableauPiece_length + 1];
		for (int i = 0; i < tableauPiece_length ; ++i) {
			tableauPieceCopy[i] = tableauPiece[i];
		}
		tableauPiece = tableauPieceCopy; 	
		
		tableauPiece[tableauPiece.length-1] = piece;
		
	}
	
	public double superficieTotale() {
		double superficieTotale = 0;
		for (int i = 0; i < tableauPiece.length; ++i) {
			superficieTotale += tableauPiece[i].getSuperficie();
		}
		return superficieTotale;
	}
	
	public double superficieEtage(int etage) {
		double superficieEtage = 0;
		for (int i = 0; i < tableauPiece.length; ++i) {
			if (etage == (tableauPiece[i].getEtage()));
			superficieEtage += tableauPiece[i].getSuperficie();
		}
		return superficieEtage;
	}

	/** Constructeur
	 *
	 * @param tableauPiece
	 */
	public Maison(Piece[] tableauPiece) {
		this.tableauPiece = tableauPiece;
	}
	
}
