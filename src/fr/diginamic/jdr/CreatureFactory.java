/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation 
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class CreatureFactory {

	public Creature creerCreature() {
		int nombre = new Random().nextInt(3)+1;
		if (nombre == 1) {
			return new Loup();
		}
		if (nombre == 2) {
			return new Gobelin();
		}
		if (nombre == 3) {
			return new Troll();
		}
	}
}
