/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Repr�sentation de la cr�ature gobelin
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Gobelin extends Creature {

	public Gobelin() {
		super("gobelin",  new Random().nextInt(6)+10, new Random().nextInt(6)+5, 2);
		System.out.println("Attaque contre un gobelin");
	}

	
	


}
