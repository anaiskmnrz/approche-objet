/**
 * 
 */
package fr.diginamic.testenumeration;

/** Représentation des saisons
 *
 * @author KOMINIARZ Anaïs
 *
 */
public enum Saison {

	PRINTEMPS("Printemps",1),ETE("Eté",2), AUTOMNE("Automne",3),HIVER("Hiver",4);
	
	private String libelle;
	private int numero;
	
	/** Constructeur
	 *
	 * @param libelle libelle de la saison
	 * @param numero numéro associé à la saison
	 */
	private Saison(String libelle, int numero) {
		this.libelle = libelle;
		this.numero = numero;
	}

	
	/**
	 * @param nvlibelle Libelle de l'énumeration
	 * @return			l'énumération correspondante à nvLibelle
	 */
	public static Saison getInstance(String nvLibelle) {
		for (Saison saison : Saison.values()) {
			if(saison.getLibelle().equals(nvLibelle)) {
				return saison;
			}
		}
		return null;
		
		//return Saison.valueOf(nom.toUpperCase());
	}
	

	/** Setter
	 *
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 *
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/** Setter
	 *
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}


	/** Getter
	 *
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	
}
