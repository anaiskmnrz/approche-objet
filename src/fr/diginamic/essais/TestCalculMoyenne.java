package fr.diginamic.essais;
import fr.diginamic.operations.CalculMoyenne;

public class TestCalculMoyenne {

	public static void main(String[] args) {
		
		CalculMoyenne calcul = new CalculMoyenne();
		
		System.out.println();
		calcul.ajout(5);
		calcul.ajout(10);
		System.out.println(calcul.moyenne());

	}

}
