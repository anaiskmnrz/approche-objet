/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation de la créature gobelin
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Gobelin extends Creature {

	int force;
	int vie;
	
	public Gobelin() {
		force = new Random().nextInt(6)+5;
		vie = new Random().nextInt(6)+10;
	}
	
	public int getAttaque() {
		return force + new Random().nextInt(10)+1;
	}

	/** Getter
	 *
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/** Setter
	 *
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/** Getter
	 *
	 * @return the vie
	 */
	public int getVie() {
		return vie;
	}

	/** Setter
	 *
	 * @param vie the vie to set
	 */
	public void setVie(int vie) {
		this.vie = vie;
	}

}
