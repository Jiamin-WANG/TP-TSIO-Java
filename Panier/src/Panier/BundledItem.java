/**
 * 
 */
package Panier;

/**
 * @author Jiamin WANG
 *
 */
public class BundledItem extends CartItem {

	/**
	 * les products vendu par paquet (plusieur items identiques) 
	 */
	public BundledItem(int quan, int size) {
		// TODO Auto-generated constructor stub
		this.quantity = quan;
		this.bundledSize = size;
	}

	/* (non-Javadoc)
	 * @see Panier.CartItem#price()
	 */
	
	private int bundledSize;
	
	int paidQuantity() {
		int paidQuan;
		paidQuan = this.quantity/this.bundledSize;
		return paidQuan;
	} 
	@Override
	int price() {
		// TODO Auto-generated method stub
		int prix;
		prix = this.paidQuantity() * this.unitPrice();
		return prix;
	}

}
