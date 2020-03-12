/**
 * 
 */
package fr.diginamic.testexceptions;

/** Test des runtime exceptions
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class TestRuntimeException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(Operation.diviserRuntime(10, 5));
		
		// Runtime avec gestion de l'exception
		//on voit qu'il fait comme si c'�tait une exception normal et ne s'arr�te plus avec une erreur
		try {
			Operation.diviserRuntime(3, 0);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
