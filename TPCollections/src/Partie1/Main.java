/**
 * 
 */
package Partie1;

import java.util.*;

/**
 * @author Jiamin WANG
 *
 */
public class Main{

	/**
	 * @param args
	 */
	LinkedList<Personne> personnes;
	
	public static void afficherPersonnes(Collection<Personne> personnes) {
		Iterator<Personne> in = personnes.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar anniversaire1 = Calendar.getInstance();
		anniversaire1.set(1996, 10, 20);
		Calendar anniversaire2 = Calendar.getInstance();
		anniversaire2.set(1970, 1, 18);
		Calendar anniversaire3 = Calendar.getInstance();
		anniversaire3.set(1980, 11, 10);
		
		Personne a = new Personne("WANG", "Jiamin", anniversaire1);
		Personne b = new Personne("CHOU", "Jay", anniversaire2);
		Personne c = new Personne("HAN", "Meimei", anniversaire3);	
	
		//LinkedList, allow doublons
		LinkedList<Personne> personnes = new LinkedList<Personne>();
		personnes.add(a);
		personnes.add(b);
		personnes.add(c);
		personnes.add(c);	
		
//		afficherPersonnes(personnes);
//		
//		Collections.reverse(personnes);
//		afficherPersonnes(personnes);
//		
//		Collections.shuffle(personnes);
//		afficherPersonnes(personnes);
		
		//HashSet, set dont allow doublons
		HashSet<Personne> personnesh = new HashSet<Personne> ();
		personnesh.add(a);
		personnesh.add(b);
		personnesh.add(c);
		personnesh.add(c);
		
		
		//Comparable treeset, 二叉树自动排序，根据comparerto 的返回值
		TreeSet<Personne> personnest = new TreeSet<Personne> ();
		personnest.add(a);
		personnest.add(b);
		personnest.add(c);
		personnest.add(c);
//		afficherPersonnes(personnest);
		
		//comparable anniversaire
		ComparatorPersonneAnniversaire d = new ComparatorPersonneAnniversaire("WANG", "Jiamin", anniversaire1);
		ComparatorPersonneAnniversaire e = new ComparatorPersonneAnniversaire("CHOU", "Jay", anniversaire2);
		ComparatorPersonneAnniversaire f = new ComparatorPersonneAnniversaire("HAN", "Meimei", anniversaire3);	

		TreeSet<ComparatorPersonneAnniversaire> personnesa = new TreeSet<ComparatorPersonneAnniversaire> ();
		personnesa.add(d);

		personnesa.add(f);
		personnesa.add(f);
		personnesa.add(e);
		afficherPersonnes2(personnesa);
		
	}
	
	public static void afficherPersonnes2(Collection<ComparatorPersonneAnniversaire> personnes) {
		Iterator<ComparatorPersonneAnniversaire> in = personnes.iterator();
		while(in.hasNext()) {
			System.out.println(in.next());
		}
		
	}
	
}
		
	
		
	
	


