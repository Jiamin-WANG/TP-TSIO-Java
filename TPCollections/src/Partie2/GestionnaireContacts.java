/**
 * 
 */
package Partie2;

import java.util.*;
import Partie1.*;

/**
 * @author Jiamin WANG
 *
 */
public class GestionnaireContacts {

	private String ges;

	Hashtable<Personne, Contact> contactbook = new Hashtable<Personne, Contact>();

	public GestionnaireContacts(String nom) {
		this.ges = nom;

	}

	public boolean ajouter(Personne p, Contact c) {
		contactbook.put(p, c);
		return true;
	}

	public Contact contact(Personne p) {
		return contactbook.get(p);
	}

	public String getNom() {
		return this.ges;
	}

	public boolean modifier(Personne p, Contact c) {
		contactbook.replace(p, c);

		return true;
	}

	public Set<Personne> personnes() {
		return contactbook.keySet();
	}

	public Set<Personne> personnes(String prefix) {// pointeur?
		Set<Personne> res = new HashSet<Personne>();
		Set<Personne> pre = this.contactbook.keySet();
		for (Iterator<Personne> in = pre.iterator(); in.hasNext();) {
			Personne tmp = in.next();
			if (tmp.getNom().startsWith(prefix)) {
				res.add(tmp);
			}
		}
		// Set<Personne> res = this.contactbook.keySet();
		// for (Iterator<Personne> iterator = res.iterator(); iterator.hasNext(); ) {
		// String name = iterator.next().getNom();
		// if (!name.startsWith(prefix)) {
		// iterator.remove();
		// }
		// }

		return res;
	}

	public boolean supprimer(Personne p) {
		contactbook.remove(p);
		return true;
	}

	public void affiche(Personne X) {
		System.out.println(X + ":" + this.contact(X));
	}

	public void afficheall() {
		Set<Personne> keys = contactbook.keySet();
		for (Personne key : keys) {
			System.out.println(key + "---" + contactbook.get(key));
		}

	}

}
