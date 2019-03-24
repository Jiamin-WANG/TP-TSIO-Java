/**
 * 
 */
package Partie2;
import java.util.Calendar;
import Partie1.*;
import Partie2.NumTel.TypeTel;
import Partie1.Main;



/**
 * @author Jiamin WANG
 *
 */
public class  Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionnaireContacts contactbook = new GestionnaireContacts("WANG Jiamin");
		
		//X
		Calendar anniversaire2 = Calendar.getInstance();
		anniversaire2.set(1970, 1, 18);
		Personne X = new Personne("CHOU", "Jay", anniversaire2);
		Contact telx = new NumTel("12345", TypeTel.FIXEPROF);
		
		contactbook.ajouter(X, telx);
		
		
		//y
		Personne Y = new Personne("WANG", "Jiamin", anniversaire2);
		Contact addy = new Adresse(12345, "rue de la chappelle", 59650, "Lille") ;
		
		contactbook.ajouter(Y, addy);

		
		//z
		Personne Z = new Personne("HU", "Chenggang", anniversaire2);
		Contact mail = new Mail("zhoujielun","gmail.com");
		
		contactbook.ajouter(Z, mail);
		contactbook.afficheall();
		
		//changer
		Contact telx2 = new NumTel("67890", TypeTel.FIXEDOM);
		contactbook.modifier(X, telx2);
		
		//affiche gestion
		contactbook.getNom();
		
		//affiche les contact pour certain personne
//		contactbook.affiche(X);
//		contactbook.affiche(Y);

		//prefix
		System.out.println((contactbook.personnes("WANG")));

		//supprimer
		contactbook.supprimer(Z);
		contactbook.afficheall();
	}

}
