/**
 * 
 */
package Panier;

/**
 * @author Jiamin WANG
 *
 */
public class ReducedPriceItem extends CartItem {

	/**
	 * les products en promotion
	 */
	public ReducedPriceItem(int quan, float pourcentage) {
		// TODO Auto-generated constructor stub
		this.quantity = quan;
		this.priceFactor = pourcentage;
	}

	/* (non-Javadoc)
	 * @see Panier.CartItem#price()
	 */
	
	private float priceFactor;
	
	@Override
	int price() {
		// TODO Auto-generated method stub
		int prix;
		prix = (int) (this.quantity * this.unitPrice() * this.priceFactor);
		return prix;
	}
	


}
