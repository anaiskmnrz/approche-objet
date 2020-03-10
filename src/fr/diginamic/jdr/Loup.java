/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation de la créature loup
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Loup extends Creature {

	/** Constructeur
	 *
	 */
	public Loup() {
		super("loup", new Random().nextInt(6)+3, new Random().nextInt(6)+5);
		System.out.println("Attaque contre un loup");
	}


	

}
