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

	int force;
	int vie;
	
	/** Constructeur
	 *
	 * @param force
	 * @param vie
	 */
	public Loup() {
		force = new Random().nextInt(6)+3;
		vie = new Random().nextInt(6)+5;
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
