/**
 * 
 */
package Partie1;

import java.util.Calendar;

/**
 * @author Jiamin WANG
 *
 */
public class ComparatorPersonneAnniversaire extends Personne implements Comparable<Personne> {

	public ComparatorPersonneAnniversaire(String nom, String prenom, Calendar anniversaire) {
		super(nom, prenom, anniversaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Personne o) {
		// TODO Auto-generated method stub
//		if(this.getNom().equals(o.getNom())) return 0;
//		else if (this.getNom(). o.getNom()) return 1;
//		else return -1;
//		
		return this.getAnniversaire().compareTo(o.getAnniversaire());
	}
}
