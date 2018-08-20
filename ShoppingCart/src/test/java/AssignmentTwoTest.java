package test.java;

import junit.framework.TestCase;
import main.java.cart.Cart;
import main.java.cart.CartBean;
import main.java.cart.Product;

public class AssignmentTwoTest extends TestCase {

	/**
	 * Verifying the 2nd scenario 
	 * <br> An empty shopping cart 
	 * <br> And a product, Dove Soap with a unit price of 39.99
	 * 
	 * <br> The user adds 5 Dove Soaps to the shopping cart
	 * <br> And then adds another 3 Dove Soaps to the shopping cart
	 *
	 * <br> Verify
	 * <br> 1. The shopping cart should contain 8 Dove Soaps each with a unit price of 39.99
	 * <br> 2. And the shopping cart’s total price should equal 319.92
	 */
	public void testAddProductToShoppingCart() {
		Product prodcut = new Product("Dove", 39.99);
		Cart cart = new CartBean(null, null);
		cart.addToCart(prodcut, 5);
		cart.addToCart(prodcut, 3);
		assertEquals(8, cart.getCartDetails().get(prodcut).intValue());
		assertEquals(319.92, cart.getCartTotal());
	}

}
