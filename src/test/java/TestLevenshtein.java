import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 */

/**
 * Tests pour la classe Levenshtein
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestLevenshtein {

	@Test
	public void testLevenshtein1() { 
		int resultat = StringUtils.levenshteinDistance("avion", "aviron");
		assertEquals(1, resultat); 
	}
	
	@Test
	public void testLevenshtein2() { 
		int resultat = StringUtils.levenshteinDistance("aviron", "avion");
		assertEquals(1, resultat); 
	}
	
	@Test
	public void testLevenshtein3() { 
		int resultat = StringUtils.levenshteinDistance("avion", null);
		assertEquals(-1, resultat); 
	}
	
	@Test
	public void testLevenshtein4() { 
		int resultat = StringUtils.levenshteinDistance("avion", "");
		assertEquals(5, resultat); 
	}
	
	@Test
	public void testLevenshtein5() { 
		int resultat = StringUtils.levenshteinDistance(null, null);
		assertEquals(-1, resultat); 
	}
}
