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

				/*
				 * int nombre = new Random().nextInt(3)+1; if ( nombre == 1) {
				 * 
				 * Loup loup = new Loup(); System.out.println("---> Attaque contre un Loup ");
				 * 
				 * while ((loup.getVie() > 0) || (p.getVie() > 0)) { int attaqueLoup =
				 * loup.getAttaque(); int attaqueP = p.getAttaque();
				 * 
				 * if (attaqueP > attaqueLoup) {
				 * loup.setVie(loup.getVie()-(attaqueP-attaqueLoup)); if (loup.getVie() <= 0) {
				 * p.setScore(p.getScore() + 1);
				 * System.out.println("Le personnage a gagné le combat. Son score est de " +
				 * p.getScore() + " points."); break; } } if (attaqueP < attaqueLoup) {
				 * p.setVie(p.getVie()-(attaqueLoup-attaqueP)); if (p.getVie() <= 0) {
				 * System.out.println("Le personnage a perdu le combat. Son score est de " +
				 * p.getScore() + " points."); sortir = true; break; } } } } if ( nombre == 2) {
				 * 
				 * Gobelin gobelin = new Gobelin();
				 * System.out.println("---> Attaque contre un Gobelin ");
				 * 
				 * while ((gobelin.getVie() > 0) || (p.getVie() > 0)) { int attaqueGobelin =
				 * gobelin.getAttaque(); int attaqueP = p.getAttaque();
				 * 
				 * if (attaqueP > attaqueGobelin) {
				 * gobelin.setVie(gobelin.getVie()-(attaqueP-attaqueGobelin)); if
				 * (gobelin.getVie() <= 0) { p.setScore(p.getScore() + 2);
				 * System.out.println("Le personnage a gagné le combat. Son score est de " +
				 * p.getScore() + " points."); break; } } if (attaqueP < attaqueGobelin) {
				 * p.setVie(p.getVie()-(attaqueGobelin-attaqueP)); if (p.getVie() <= 0) {
				 * System.out.println("Le personnage a perdu le combat. Son score est de " +
				 * p.getScore() + " points."); sortir = true; break; } } } } if ( nombre == 3) {
				 * 
				 * Troll troll = new Troll();
				 * System.out.println("---> Attaque contre un Troll ");
				 * 
				 * while ((troll.getVie() > 0) || (p.getVie() > 0)) { int attaqueTroll =
				 * troll.getAttaque(); int attaqueP = p.getAttaque();
				 * 
				 * if (attaqueP > attaqueTroll) {
				 * troll.setVie(troll.getVie()-(attaqueP-attaqueTroll)); if (troll.getVie() <=
				 * 0) { p.setScore(p.getScore() + 5);
				 * System.out.println("Le personnage a gagné le combat. Son score est de " +
				 * p.getScore() + " points."); break; } } if (attaqueP < attaqueTroll) {
				 * p.setVie(p.getVie()-(attaqueTroll-attaqueP)); if (p.getVie() <= 0) {
				 * System.out.println("Le personnage a perdu le combat. Son score est de " +
				 * p.getScore() + " points."); sortir = true; break; } } } } }
				 */
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
