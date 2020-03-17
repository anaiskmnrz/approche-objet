package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/temp/recensement population 2016.csv");
		List<String> lignes = FileUtils.readLines(file, "UTF-8");
		
		for (String ligne : lignes) {
			System.out.println(ligne);
		}

	}
	
	//soit throws IOException soit le try and catch
}