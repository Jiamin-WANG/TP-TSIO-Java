/**
 * 
 */
package Panier;

/**
 * @author Jiamin WANG
 *
 */
public abstract class CartItem {

	/**
	 * 
	 */
	public CartItem() {
		
	}
	public CartItem(Product product) {
		this.product = product;
	}
	
	protected int quantity;
	protected Product product;
	
	Product getProduct() {
		return this.product; 
	}
	
	int getQuantity() {
		return quantity;
	}
	
	int unitPrice() {
		return this.getProduct().unitPrice();
	}
	
	public String toString() {
		return "You've add " + quantity + getProduct().description() + "for " + this.unitPrice() + "each.";
	}
	
	boolean decreaseQty(int quantity) {
		quantity ++;
		return true;
	}
	
	boolean increaseQty(int quantity) {
		quantity --;
		return true;
	}
	
	abstract int price();
}
