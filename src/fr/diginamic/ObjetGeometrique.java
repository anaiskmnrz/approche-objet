/**
 * 
 */
package fr.diginamic;

/** Représentation d'un objet géométrique
 *
 * @author KOMINIARZ Anaïs
 *
 */
public interface ObjetGeometrique {

	/** Retourne le périmètre d'une forme géométrique
	 * @return double
	 */
	double perimetre();
	
	/** Retourne la surface d'une forme géométrique
	 * @return double
	 */
	double surface();
}
