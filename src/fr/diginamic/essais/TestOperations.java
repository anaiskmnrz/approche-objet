/**
 * 
 */
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/** Test les op�rations de base 
 *
 * @author KOMINIARZ Ana�s
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
