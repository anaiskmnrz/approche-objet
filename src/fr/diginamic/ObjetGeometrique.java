/**
 * 
 */
package fr.diginamic;

/** Repr�sentation d'un objet g�om�trique
 *
 * @author KOMINIARZ Ana�s
 *
 */
public interface ObjetGeometrique {

	/** Retourne le p�rim�tre d'une forme g�om�trique
	 * @return double
	 */
	double perimetre();
	
	/** Retourne la surface d'une forme g�om�trique
	 * @return double
	 */
	double surface();
}
