import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.PieceException;
import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

/**
 * 
 */

/** Création d'une batterie de tests pour Maison
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestMaison {

	Maison maison = new Maison();
	
	@Before
	public void setUp() throws PieceException {
		Cuisine c1 = new Cuisine(10, 0);
		Salon s1 = new Salon(25, 0);
		WC w1 = new WC(5, 0);
		Chambre ch1 = new Chambre(13, 1);
		SalleDeBain sdb1 = new SalleDeBain(8, 1);
		
		maison.ajouterPiece(c1);
		maison.ajouterPiece(ch1);
		maison.ajouterPiece(w1);
		maison.ajouterPiece(s1);
		maison.ajouterPiece(sdb1);
	}
	
	@Test
	public void testMaison1() {
		double resultat = maison.superficieTotale();
		assertEquals(61.0,resultat, 0.00001);
	}
	
	@Test
	public void testMaison2() {
		double resultat = maison.superficieEtage(0);
		assertEquals(40.0,resultat, 0.00001);
	}
	
	@Test
	public void testMaison3() {
		double resultat = maison.superficieEtage(1);
		assertEquals(21.0,resultat, 0.00001);
	}
	
	@Test(expected = PieceException.class)
	public void testMaison4() throws PieceException {
		maison.ajouterPiece(null);
	}
	
	@Test(expected = PieceException.class)
	public void testMaison5() throws PieceException {
		Chambre ch2 = new Chambre(-8,0);
		maison.ajouterPiece(ch2);
	}
	
	
}
