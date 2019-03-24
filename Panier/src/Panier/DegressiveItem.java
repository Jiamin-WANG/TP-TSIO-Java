/**
 * 
 */
package Panier;

/**
 * @author Jiamin WANG
 *
 */
public class DegressiveItem extends CartItem {

	/**
	 * un grand nombre des products vendu et avoir un reduction 
	 */
	public DegressiveItem(int quan, int seuil, int afterprice) {
		// TODO Auto-generated constructor stub
		this.quantity = quan;
		this.thresholdQuantity = seuil;
		this.reduceUnitPrice = afterprice;
	}

	/* (non-Javadoc)
	 * @see Panier.CartItem#price()
	 */
	private int thresholdQuantity;
	private int reduceUnitPrice;
	
	@Override
	int price() {
		// TODO Auto-generated method stub
		int prix;
		prix = this.thresholdQuantity * this.unitPrice() + (this.quantity - this.thresholdQuantity) * this.reduceUnitPrice;
		
		return prix;
	}
//	@Override
//	public boolean equals(Object object) {
//		if(!(object instanceof DegressiveItem))
//			return false;
//		DegressiveItem item = (DegressiveItem)object;
//		if(item.reduceUnitPrice == this.reduceUnitPrice)
//	}

}
