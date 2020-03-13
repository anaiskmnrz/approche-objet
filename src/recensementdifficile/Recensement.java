/**
 * 
 */
package recensementdifficile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import fr.diginamic.recensement.Ville;

/** Répresentation de toutes les villes de France
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class Recensement {

	private ArrayList<Ville> recensement;

	/** Constructeur
	 *
	 * @param recensement
	 * @throws IOException 
	 */
	public Recensement() throws IOException {
		File file = new File("D:/temp/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");

		recensement = new ArrayList<>();
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
	}

	/** Getter
	 *
	 * @return the recensement
	 */
	public ArrayList<Ville> getRecensement() {
		return recensement;
	}

	/** Setter
	 *
	 * @param recensement the recensement to set
	 */
	public void setRecensement(ArrayList<Ville> recensement) {
		this.recensement = recensement;
	}
	
}
