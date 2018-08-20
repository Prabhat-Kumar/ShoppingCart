package test.java;

import junit.framework.TestCase;
import main.java.cart.Cart;
import main.java.cart.CartBean;
import main.java.cart.Product;

public class AssignmentOneTest extends TestCase {

	/**
	 * Verifying the 1st scenario 
	 * <br> An empty shopping cart 
	 * <br> And a product, Dove Soap with a unit price of 39.99
	 * 
	 * <br> The user adds 5 Dove Soaps to the shopping cart
	 *
	 * <br> Verify
	 * <br> 1. The shopping cart should contain 5 Dove Soaps each with a unit price of 39.99
	 * <br> 2. And the shopping cart’s total price should equal 199.95
	 */
	public void testAddProductToShoppingCart() {
		Product prodcut = new Product("Dove", 39.99);
		Cart cart = new CartBean(null,null);
		cart.addToCart(prodcut, 5);
		assertEquals(5, cart.getCartDetails().get(prodcut).intValue());
		assertEquals(199.95, cart.getCartTotal());
		cart.getDiscountOnCartTotal();
		System.out.println(cart);
	}
}
