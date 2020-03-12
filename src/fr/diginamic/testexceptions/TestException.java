/**
 * 
 */
package fr.diginamic.testexceptions;

/** Test de gestion d'une exception
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a = 2;
		double b = 0;
		//Gestion de l'exception si b == 0
		try {
			double c = Operation.diviser(a,b);
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
