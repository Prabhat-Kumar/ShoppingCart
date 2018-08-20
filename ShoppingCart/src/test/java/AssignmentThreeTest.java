package test.java;

import junit.framework.TestCase;
import main.java.cart.Cart;
import main.java.cart.CartBean;
import main.java.cart.Product;
import main.java.tax.Taxable;
import main.java.tax.TaxableBean;

public class AssignmentThreeTest extends TestCase {

	/**
	 * Verifying the 3rd scenario <br>
	 * An empty shopping cart <br>
	 * And a product, Dove Soap with a unit price of 39.99 <br>
	 * And another product, Axe Deo with a unit price of 99.99 <br>
	 * And a tax rate of 12.5%
	 * 
	 * <br>
	 * The user adds 2 Dove Soaps to the shopping cart <br>
	 * And then adds 2 Axe Deo’s to the shopping cart
	 *
	 * <br>
	 * Verify <br>
	 * 1. The shopping cart should contain 2 Dove Soaps each with a unit price of
	 * 39.99 <br>
	 * 2. And the shopping cart should contain 2 Axe Deo’s each with a unit price of
	 * 99.99 <br>
	 * 3. And the total tax amount should equal 35.00 <br>
	 * 4. And the shopping cart’s total price should equal 314.96
	 */
	public void testAddProductAndCalculateTaxOnShoppingCart() {
		Product prodcut1 = new Product("Dove", 39.99);
		Product prodcut2 = new Product("Axe Deo", 99.99);
		Taxable taxable = new TaxableBean();
		Cart cart = new CartBean(taxable, null);
		cart.addToCart(prodcut1, 2);
		cart.addToCart(prodcut2, 2);
		assertEquals(2, cart.getCartDetails().get(prodcut1).intValue());
		assertEquals(2, cart.getCartDetails().get(prodcut2).intValue());
		assertEquals(35.00, cart.getTaxOnCartTotal());
		assertEquals(314.96, cart.getCartTotal());
		System.out.println(cart);
	}

}
