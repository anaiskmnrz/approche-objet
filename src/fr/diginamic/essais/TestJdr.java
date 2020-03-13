/**
 * 
 */
package fr.diginamic.essais;

import java.util.Scanner;

import fr.diginamic.jdr.Creature;
import fr.diginamic.jdr.CreatureFactory;
import fr.diginamic.jdr.Personnage;

/**
 * Jeu de rôle
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestJdr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("JEU DE ROLE\n Un personnage est créé automatiquement au 1er tour du jeu de rôle. ");

		System.out.println("Voici un menu pour le jeu de rôle : ");
		System.out.println("1. Créer votre personnage. ");
		System.out.println("2. Combattre une créature. ");
		System.out.println("3. Afficher votre score. ");
		System.out.println("4. Sortir du jeu. ");

		boolean sortir = false;
		Personnage p = new Personnage();

		while (sortir == false) {
			int option = 0;
			while (option != 1 && option != 2 && option != 3 && option != 4) {
				System.out.print("\nVeuillez choisir une option en indiquant le numéro correspondant : ");
				Scanner saisie = new Scanner(System.in);
				option = saisie.nextInt();
			}
			if (option == 1) {
				p = new Personnage();

			}
			if (option == 2) {
				if (p.getScore() < 0) {
					System.out.println("Votre personnage est décédé. Il a obtenu le score de " + p.getScore()
							+ " points. Veuillez créer un nouveau personnage");
				} else {
					Creature creature = CreatureFactory.creerCreature();
					// System.out.println("---> Attaque contre un Loup ");

					while ((creature.getVie() > 0) || (creature.getVie() > 0)) {
						int attaqueCreature = creature.getAttaque();
						int attaqueP = p.getAttaque();

						if (attaqueP > attaqueCreature) {
							creature.setVie(creature.getVie() - (attaqueP - attaqueCreature));
							if (creature.getVie() <= 0) {
								p.setScore(p.getScore() + creature.getScore());
								System.out.println(
										"Le personnage a gagné le combat. Score = " + p.getScore() + " points.");
								break;
							}
						}
						if (attaqueP < attaqueCreature) {
							p.setVie(p.getVie() - (attaqueCreature - attaqueP));
							if (p.getVie() <= 0) {
								System.out.println(
										"Le personnage a perdu le combat. Score = " + p.getScore() + " points.");
								sortir = true;
								break;
							}
						}
					}
				}

			}
			if (option == 3) {
				System.out.println("Le score du personnage est de " + p.getScore() + " points.");
			}
			if (option == 4) {
				sortir = true;
			}
		}
	}

}
