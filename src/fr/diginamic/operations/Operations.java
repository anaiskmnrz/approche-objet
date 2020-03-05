/**
 * 
 */
package fr.diginamic.operations;

/** Représentation des opérations de base
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Operations {

	/**
	 * @param a un nombre réel
	 * @param b un nombre réel 
	 * @param operateur + - * et / pour les opérations de bases
	 * @return a operateur b, si l'opérateur n'est aucun des 4, elle retourne PI 
	 */
	public static double calcul(double a, double b, char operateur) {
		if (operateur == '+') {
			return a + b;
		}
		if (operateur == '-') {
			return a - b;
		}
		if (operateur == '*') {
			return a * b;
		}
		if (operateur == '/') {
			return a / b;
		}
		return Math.PI;
	}
}
