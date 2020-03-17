/**
 * 
 */
package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Test du calendar
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// création d'un calendar 
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.HOUR_OF_DAY, 23); 
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);
		
		//récupération de cette date crée avec le calendar 
		Date date1 = cal.getTime();

		//gestion du format d'affichage + affichage de la date 
		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatage1.format(date1));
		
		// autre format d'affichage 
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatage2.format(date1));
		
		// Affichage de la date système avec un 3e format d'affichage
		Calendar calMaintenant = Calendar.getInstance();
		SimpleDateFormat formatage3 = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println(formatage3.format(calMaintenant.getTime()));
		
	}

}
