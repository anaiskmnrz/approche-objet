/**
 * 
 */
package fr.diginamic.essais;
import fr.diginamic.salaire.*;

/** Test des intervenants 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestIntervenant {

	public static void main(String[] args) {
		
		Salarie s1 = new Salarie("borel","jean-pierre");
		s1.setSalaireMensuel(1000);
		System.out.println(s1.getSalaire());
		
		Pigiste p1 = new Pigiste("arnault","françois",18,90);
		System.out.println(p1.getSalaire());
		
		System.out.println("\n --- afficherDonnees ---\n");
		p1.afficherDonnees();
		s1.afficherDonnees();
	}

}
