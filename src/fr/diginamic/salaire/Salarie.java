/**
 * 
 */
package fr.diginamic.salaire;

/** Repr�sentation d'un salari� du journal (contrat CDD ou CDI)
 *
 * @author KOMINIARZ Ana�s
 *
 */
public class Salarie extends Intervenant {

	/** montant du salaire mensuel **/
	private double salaireMensuel;

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return salaireMensuel;
	} 

	@Override
	public String getType() {
		return "Salari�";
	}
	
	/** Constructeur
	 *
	 * @param nom 		nom du salari�
	 * @param prenom	pr�nom du salari�
	 */
	public Salarie(String nom, String prenom) {
		super(nom, prenom);
	}
	
	/** Getter
	 *
	 * @return the salaireMensuel
	 */
	public double getSalaireMensuel() {
		return salaireMensuel;
	}

	/** Setter
	 *
	 * @param salaireMensuel the salaireMensuel to set
	 */
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	
	
}
