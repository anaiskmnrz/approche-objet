/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation de la créature troll
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Troll extends Creature {

	public Troll() {
		super("troll", new Random().nextInt(11)+20, new Random().nextInt(6)+10);
		System.out.println("Attaque contre un troll");
	}



}
