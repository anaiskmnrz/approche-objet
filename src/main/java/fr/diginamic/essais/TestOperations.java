/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/** Test les opérations de base 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestOperations {

	public static void main(String[] args) {
		
		System.out.println(Operations.calcul(2, 2, '+'));
		System.out.println(Operations.calcul(2, 2, '-'));
		System.out.println(Operations.calcul(2, 2, '*'));
		System.out.println(Operations.calcul(2, 2, '/'));
		System.out.println(Operations.calcul(2, 2, '%'));
	}

}
