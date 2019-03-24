/**
 * 
 */
package Panier;

/**
 * @author Jiamin WANG
 *
 */
public class RegularItem extends CartItem{

	/**
	 * les products normal
	 */
	public RegularItem(int quan) {
		// TODO Auto-generated constructor stub
		super(quan);
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		int prix;
		prix = this.unitPrice() * this.getQuantity();
		return prix;
	}

}
