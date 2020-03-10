/**
 * 
 */
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

/**
 * Représentation
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Application {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		//ajout des différentes villes dans recensement
		File file = new File("D:/temp/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");

		ArrayList<Ville> recensement = new ArrayList<>();

		for (int ligne = 1; ligne < lignes.size(); ++ligne) {

			String[] morceaux = lignes.get(ligne).split(";");
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			String population = morceaux[7];

			int populationTotale = Integer.parseInt(population.replace(" ", ""));
			// System.out.println(populationTotale);
			Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);

			recensement.add(ville);
		}

		
		/* affichage des infos concernant Montpellier 
		+ population du dep + plus petite ville de l'Herault*/
		int populationMax = 0;
		int popOccitanieMax = 0;
		String plusPetiteVille = null;
		int populationMin = recensement.get(0).getPopulationTotale();
		for (Ville ville : recensement) {
			if (ville.getNomCommune().equals("Montpellier")) {
				System.out.println(ville);
			}
			if (ville.getCodeDepartement().equals("34")) {
				populationMax += ville.getPopulationTotale();
				if (ville.getPopulationTotale() <= populationMin) {
					populationMin = ville.getPopulationTotale();
					plusPetiteVille = ville.getNomCommune();
				}
			}
			if (ville.getNomRegion().equals("Occitanie")) {
				popOccitanieMax += ville.getPopulationTotale();
			}
		}
		System.out.println("population max Hérault: " + populationMax);
		System.out.println("Nom + petite ville Hérault: " + plusPetiteVille);

		
		// les 10 plus petites + 10 plus grandes villes de l'Herault
		TreeMap<Integer, String> popHerault = new TreeMap<>();

		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String nom = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();

			if (ville.getCodeDepartement().equals("34")) {
				popHerault.put(pop, nom);
			}
		}

		/*
		 * Iterator<String> valuesIte = popRegion.values().iterator(); int nombre = 0;
		 * while ( nombre < 10) { String ville = valuesIte.next();
		 * System.out.print(ville + " "); ++nombre; }
		 */
		// solution ci-dessus se compliquait pour les 10 dernières.

		ArrayList<String> villesHerault = new ArrayList<>();
		villesHerault.addAll(popHerault.values());

		System.out.print("les 10 villes les + peuplées de l'Herault : (+ grand au + petit) ");
		for (int i = villesHerault.size() - 1; i > villesHerault.size() - 11; --i) {
			System.out.print(villesHerault.get(i) + " ");
		}

		System.out.print("\nles 10 villes les - peuplées de l'Herault : (+ petit au + grand) ");
		for (int i = 0; i < 10; ++i) {
			System.out.print(villesHerault.get(i) + " ");
		}

		System.out.println("\nPopulation totale Occitanie : " + popOccitanieMax);

		// population totale occitanie
		TreeMap<Integer, String> popOccitanie = new TreeMap<>();

		// 10 + grandes villes occitanie
		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String nom = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();
			if (ville.getNomRegion().equals("Occitanie")) {
				popOccitanie.put(pop, nom);
			}
		}

		ArrayList<String> villesOccitanie = new ArrayList<>();
		villesOccitanie.addAll(popOccitanie.values());

		System.out.print("les 10 villes les + peuplées de l'Occitanie : (+ grand au + petit) ");
		for (int i = villesOccitanie.size() - 1; i > villesOccitanie.size() - 11; --i) {
			System.out.print(villesOccitanie.get(i) + " ");
		}
		System.out.println("\n");

		
		// département le + peuplé d'occitanie
		HashMap<String, Integer> popOccitanie2 = new HashMap<>();
		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String dep = ville.getCodeDepartement();
			Integer pop = ville.getPopulationTotale();
			if (ville.getNomRegion().equals("Occitanie")) {
				if (popOccitanie2.containsKey(dep)) {
					pop += popOccitanie2.get(dep);
				}
				popOccitanie2.put(dep, pop);
			}
		}

		TreeMap<Integer, String> popOccitanie2Tri = new TreeMap<>();
		Iterator<String> keysIte = popOccitanie2.keySet().iterator();
		while (keysIte.hasNext()) {
			String next = keysIte.next();
			popOccitanie2Tri.put(popOccitanie2.get(next), next);
		}

		ArrayList<String> popOccitanieFINAL = new ArrayList<>();
		popOccitanieFINAL.addAll(popOccitanie2Tri.values());

		System.out.println("Département le + peuplé d'Occitanie: " + popOccitanieFINAL.get(popOccitanieFINAL.size() - 1));

		/*
		 * Iterator<Integer> valuesIte = popOccitanie2.values().iterator(); int nombre =
		 * 0; Integer max = 0; while ( valuesIte.hasNext()) { Integer nb =
		 * valuesIte.next();
		 * 
		 * if (nb > max) { max = nb; } } System.out.println(max);
		 */


		// 10 régions les + peuplés de France
		HashMap<String, Integer> popRegions = new HashMap<>();
		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String region = ville.getNomRegion();
			Integer pop = ville.getPopulationTotale();
			if (popRegions.containsKey(region)) {
				pop += popRegions.get(region);
			}
			popRegions.put(region, pop);

		}

		TreeMap<Integer, String> popRegionsTri = new TreeMap<>();
		Iterator<String> keysIteRegions = popRegions.keySet().iterator();
		while (keysIteRegions.hasNext()) {
			String next = keysIteRegions.next();
			popRegionsTri.put(popRegions.get(next), next);
		}

		ArrayList<String> popRegionsFINAL = new ArrayList<>();
		popRegionsFINAL.addAll(popRegionsTri.values());

		System.out.print("\nles 10 régions les + peuplées de France : (+ grand au + petit) ");
		for (int i = popRegionsFINAL.size() - 1; i > popRegionsFINAL.size() - 11; --i) {
			System.out.print(popRegionsFINAL.get(i) + " ");
		}
		System.out.println("\n");

		
		// 10 départements les + peuplés de France
		HashMap<String, Integer> popDep = new HashMap<>();
		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String dep = ville.getCodeDepartement();
			Integer pop = ville.getPopulationTotale();
			if (popDep.containsKey(dep)) {
				pop += popDep.get(dep);
			}
			popDep.put(dep, pop);

		}

		TreeMap<Integer, String> popDepTri = new TreeMap<>();
		Iterator<String> keysIteDep = popDep.keySet().iterator();
		while (keysIteDep.hasNext()) {
			String next = keysIteDep.next();
			popDepTri.put(popDep.get(next), next);
		}

		ArrayList<String> popDepFINAL = new ArrayList<>();
		popDepFINAL.addAll(popDepTri.values());

		System.out.print("\nles 10 départements les + peuplées de France : (+ grand au + petit) ");
		for (int i = popDepFINAL.size() - 1; i > popDepFINAL.size() - 11; --i) {
			System.out.print(popDepFINAL.get(i) + " ");
		}
		System.out.println("\n");
		
		// 10 villes les + peuplés de France
		TreeMap<Integer,String> popVillesTri = new TreeMap<>();
		for (int i = 0; i < recensement.size(); ++i) {
			Ville ville = recensement.get(i);
			String commune = ville.getNomCommune();
			Integer pop = ville.getPopulationTotale();
			popVillesTri.put(pop, commune);

		}

		ArrayList<String> popVillesFINAL = new ArrayList<>();
		popVillesFINAL.addAll(popVillesTri.values());

		System.out.print("\nles 10 villes les + peuplées de France : (+ grand au + petit) ");
		for (int i = popVillesFINAL.size() - 1; i > popVillesFINAL.size() - 11; --i) {
			System.out.print(popVillesFINAL.get(i) + " ");
		}
		System.out.println("\n");
	}

}
