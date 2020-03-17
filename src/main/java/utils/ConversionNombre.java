package utils;
import java.lang.Integer; 

/**
 * Conversion d'une string en int.
 * @author KOMINIARZ Anaïs
 *
 */
public class ConversionNombre {

	public static void main(String[] args) {
		
		String numberString = "99";
		
		int number = Integer.valueOf(numberString);
		System.out.println(number);
	}

}
