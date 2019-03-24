/**
 * 
 */
package Partie1;
import java.util.*;

/**
 * @author Jiamin WANG
 *
 */
public class Personne implements Comparable<Personne> {
	protected String nom;
	protected String prenom;
	protected Calendar anniversaire;
	
	public Personne(String nom, String prenom, Calendar anniversaire) {
	this.nom = nom;
	this.prenom = prenom;
	this.anniversaire = anniversaire;
	}
	
	public String getNom() { return nom ; }
	
	public String getPrenom() { return prenom; }
	
	public Calendar getAnniversaire() { return anniversaire;}
	
	@Override
	public String toString() {
	return prenom + " " + nom + " : " +
	anniversaire.get(Calendar.DAY_OF_MONTH) + "/" +
	anniversaire.get(Calendar.MONTH) + "/" +
	anniversaire.get(Calendar.YEAR);
	}


	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
//		if(this.getNom().equals(o.getNom())) return 0;
//		else if (this.getNom(). o.getNom()) return 1;
//		else return -1;
//		
		return this.getNom().compareTo(o.getNom());
	}
	

}
