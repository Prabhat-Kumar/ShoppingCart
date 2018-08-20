package main.java.offer;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import main.java.cart.Cart;

public class OfferFilterBean implements OfferFilter{
	
	
	private List<Offer> offers = null;
	
	public OfferFilterBean(List<Offer> offers) {
		this.offers = offers;
	}

	/* (non-Javadoc)
	 * @see main.java.offer.OfferFilter#applyOffer(main.java.cart.Cart, int, int)
	 */
	@Override
	public double getDiscount(Cart cart) {
		double discount = 0;
		for (Offer offer : this.offers) {
			if (cart.getCartDetails().size() == 0 || !cart.getCartDetails().containsKey(offer.getProduct())) {
	            return 0;
	        } else {
	        	AtomicInteger numberOfGroup = new AtomicInteger(cart.getCartDetails().get(offer.getProduct()) / offer.getTotalQuantity());
	        	discount += numberOfGroup.get()*(offer.getTotalQuantity()- offer.getPricedQuantity())*offer.getProduct().getPrice();
			}
		}
		return discount;
    }
}
