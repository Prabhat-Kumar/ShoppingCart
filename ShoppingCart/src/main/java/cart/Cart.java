package main.java.cart;

import java.util.Map;

public interface Cart {

	/**
	 * Get list of {@link Product} available in {@link Cart}
	 * 
	 * @return {@link Cart} {@link Product} list and quantity.
	 */
	public Map<Product, Integer> getCartDetails();

	/**
	 * Add {@link Product} to {@link Cart} with quantity.
	 * 
	 * @param item
	 *            {@link Product} to add
	 * @param quantity
	 *            quantity of {@link Product}
	 */
	public void addToCart(Product item, Integer quantity);

	/**
	 * Get Cart total amount.
	 * 
	 * @return total amount.
	 */
	public double getCartTotal();

	/**
	 * Get calculated tax on given amount
	 * 
	 * @return tax.
	 */
	public double getTaxOnCartTotal();

	/**
	 * Get the discount amount on the cart.
	 * 
	 * @return amount discounted amount.
	 */
	public double getDiscountOnCartTotal();
}
