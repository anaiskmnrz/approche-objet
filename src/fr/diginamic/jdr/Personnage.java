/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation d'un personnage
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Personnage {

	/** force du personnage entre 12 et 18 **/
	private int force;
	/** points de vie du personnage entre 20 et 50 **/
	private int vie;
	/** score du personnage initialisé à 0 **/
	private int score;
	
	public int afficherScore() {
		return score;
	}
	
	
	/** Constructeur
	 *
	 * @param force
	 * @param vie
	 * @param score
	 */
	public Personnage() {
		force = new Random().nextInt(7)+12;
		vie = new Random().nextInt(31)+20;
		score = 0;
		System.out.println("\n***** NOUVEAU PERSONNAGE *****");
		System.out.println("      FORCE "+ force + " --- VIE " +vie);
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

	/** Getter
	 *
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/** Setter
	 *
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	

}
