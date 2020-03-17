/**
 * 
 */
package fr.diginamic.jdr;

import java.util.Random;

/** Représentation d'une créature
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Creature {
	
	//Creature creature;
	private int vie;
	private int force;
	private String nom; 
	private int score;
	
	
	/** Constructeur
	 *
	 * @param vie
	 * @param force
	 * @param nom
	 */
	public Creature( String nom, int vie, int force, int score) {
		super();
		this.vie = vie;
		this.force = force;
		this.nom = nom;
		this.setScore(score);
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
	
	public int getAttaque() {
		return force + new Random().nextInt(10)+1;
	}

	/** Getter
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 *
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	//public abstract int getAttaque();*/
	
}
