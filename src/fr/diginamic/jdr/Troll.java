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

	int force; 
	int vie; 
	
	
	public Troll() {
		force = new Random().nextInt(6)+10;
		vie = new Random().nextInt(11)+20;
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
