/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

/** Test de date
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestDates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// création d'une date + gestion du format d'affichage + affichage de celle-ci
		Date date1 = new Date(120,02,12);
		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(formatage1.format(date1));
		
		// création d'une date + heure + gestion du format d'affichage + affichage de celle-ci 
		Date date2 = new Date(120,02,12,23,30,59);
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatage2.format(date2));
		
		// Affichage de la date système sous formatage2 
		Date date3 = new Date();
		System.out.println(formatage2.format(date3.getTime()));
		
		

	}

}
