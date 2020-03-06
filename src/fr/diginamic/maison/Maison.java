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
		if (piece != null ) {
			int tableauPiece_length = tableauPiece.length;
			Piece[] tableauPieceCopy = new Piece[tableauPiece_length + 1];
			for (int i = 0; i < tableauPiece_length; ++i) {
				tableauPieceCopy[i] = tableauPiece[i];
			}
			tableauPiece = tableauPieceCopy; 	
		
			tableauPiece[tableauPiece.length-1] = piece;
		} else {
			System.out.println("On ne peut pas ajouter de pièces de type null. ");
		}
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
			if (etage == (tableauPiece[i].getEtage())) {
				superficieEtage += tableauPiece[i].getSuperficie();
			}
		}
		return superficieEtage;
	}
	
	public double superficieTotalePiece(Piece piece) {
		
		for (int i = 0; i < tableauPiece.length; ++i) {
		}
		
		return 1;
	}

	/** Constructeur
	 *
	 * @param tableauPiece est un tableau de pièces 
	 */
	public Maison() {
		tableauPiece = new Piece[0];
	}
	
}
