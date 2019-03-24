/**
 * 
 */
package Partie2;

/**
 * @author Jiamin WANG
 *
 */
public class Mail extends Contact {

	/**
	 * 
	 */
	
	protected String identifiant;
	protected String domaine;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}
	
	public Mail(String identifiant, String domaine) {
		super();
		this.identifiant = identifiant;
		this.domaine = domaine;
	}
	
	public String toString() {
		return identifiant + "@" + domaine;
	}

}
