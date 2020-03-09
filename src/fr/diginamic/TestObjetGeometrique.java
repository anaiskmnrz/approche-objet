/**
 * 
 */
package fr.diginamic;

/** Test de l'interface ObjetGeometrique
 *
 * @author KOMINIARZ Anaïs
 *
 */
public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		
		tab[0] = new Cercle(2.25);
		tab[1] = new Rectangle(2.5, 1);
		
		for (int i = 0; i < tab.length; ++i) {
			System.out.println(tab[i] + "Surface = " + tab[i].surface());
			System.out.println( "Périmètre = " + tab[i].perimetre());
		}

	}

}
