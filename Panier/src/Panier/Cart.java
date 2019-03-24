/**
 * 
 */
package Panier;

import java.util.*;

/**
 * @author Jiamin WANG
 *
 */
public class Cart {

	public LinkedList <CartItem> list = new LinkedList<CartItem> ();
	public Cart() {

	}
	
	public void clear() {
		list.clear();
	}
	
	public void add(CartItem item) {
		list.add(item);
	}
	
	public void remove(CartItem item) {
		list.remove(item);
	}
	
	public int total() {
		int cout=0;
		Iterator<CartItem> in = list.iterator();
		while (in.hasNext()) {
			cout = cout + in.next().price();	
		}
		
		return cout;
	}
	
	public int quantity(Product p) {
	//	int unitPrice = p.unitPrice();
		return list.g;
	}
	
}
