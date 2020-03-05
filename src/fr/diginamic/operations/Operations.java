/**
 * 
 */
package fr.diginamic.operations;

/** Repr�sentation des op�rations de base
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Operations {

	/**
	 * @param a un nombre r�el
	 * @param b un nombre r�el 
	 * @param operateur + - * et / pour les op�rations de bases
	 * @return a operateur b, si l'op�rateur n'est aucun des 4, elle retourne PI 
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
