/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Repr�sentation de la cr�ature loup
 *
 * @author KOMINIARZ Ana�s
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
