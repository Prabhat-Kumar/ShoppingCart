package main.java.offer;

import main.java.cart.Cart;

public interface OfferFilter {
	
	public double getDiscount(Cart cart);

}
