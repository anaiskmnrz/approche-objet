/**
 * 
 */
package fr.diginamic.salaire;

/** Représentation d'un salarié du journal (contrat CDD ou CDI)
 *
 * @author KOMINIARZ Anaïs
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
		return "Salarié";
	}
	
	/** Constructeur
	 *
	 * @param nom 		nom du salarié
	 * @param prenom	prénom du salarié
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
