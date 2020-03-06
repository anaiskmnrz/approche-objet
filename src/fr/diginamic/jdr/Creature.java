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
	
	/** Constructeur
	 *
	 * @param nombre
	 */
 	public Creature() {
 		
	}
	
	public void creerCreature() {
		int nombre = new Random().nextInt(3)+1;
		if (nombre == 1) {
			new Loup();
			nom = "loup";
			System.out.println("Attaque contre un loup");
			force = new Random().nextInt(6)+3;
			vie = new Random().nextInt(6)+5;
		}
		if (nombre == 2) {
			new Gobelin();
			nom = "gobelin";
			System.out.println("Attaque contre un gobelin");
			force = new Random().nextInt(6)+5;
			vie = new Random().nextInt(6)+10;
		}
		if (nombre == 3) {
			new Troll();
			nom = "troll";
			System.out.println("Attaque contre un troll");
			force = new Random().nextInt(6)+10;
			vie = new Random().nextInt(11)+20;
		}
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

	//public abstract int getAttaque();*/
	
}
