/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Repr�sentation de la cr�ature troll
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Troll extends Creature {

	public Troll() {
		super("troll", new Random().nextInt(11)+20, new Random().nextInt(6)+10);
		System.out.println("Attaque contre un troll");
	}



}
