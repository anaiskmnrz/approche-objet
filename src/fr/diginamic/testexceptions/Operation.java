/**
 * 
 */
package fr.diginamic.testexceptions;

/** Repr�sentation des op�rations
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Operation {

	/**
	 * @param a un double
	 * @param b un double
	 * @return la division de a/b
	 * @throws Exception
	 */
	public static double diviser(double a, double b) throws DivException {
		if (b == 0) {
			throw new DivException("b ne peut pas �tre nul.");
		}
		return a/b;
	}
	
	public static double diviserRuntime(double a, double b) {
		if (b == 0) {
			throw new RuntimeException("b ne peut pas �tre nul.");
		}
		return a/b;
	}
}
