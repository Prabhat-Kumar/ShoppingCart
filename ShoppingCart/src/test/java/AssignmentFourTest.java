package test.java;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import main.java.cart.Cart;
import main.java.cart.CartBean;
import main.java.cart.Product;
import main.java.offer.Offer;
import main.java.offer.OfferFilter;
import main.java.offer.OfferFilterBean;
import main.java.tax.Taxable;
import main.java.tax.TaxableBean;

public class AssignmentFourTest extends TestCase {

	/**
	 * Verifying the 3rd scenario <br>
	 * An empty shopping cart <br>
	 * And a product, Dove Soap with a unit price of 39.99 and associated Buy 2 and
	 * get 1 Free offer. <br>
	 * And a tax rate of 12.5%
	 * 
	 * <br>
	 * The user adds 3 Dove Soaps to the shopping cart
	 *
	 * <br>
	 * Verify <br>
	 * 1. The shopping cart should contain 3 Dove Soaps each with a unit price of
	 * 39.99 <br>
	 * 3. And the total discount amount should equal 39.99 <br>
	 * 3. And the total tax amount should equal 10.00 <br>
	 * 4. And the shopping cart’s total price should equal 89.98
	 */
	public void testAddProductAndCalculateTaxOnShoppingCart() {
		Product product1 = new Product("Dove", 39.99);
		Taxable taxable = new TaxableBean();
		Offer offer = new Offer(product1, 3, 2);
		List<Offer> offers = new ArrayList<Offer>();
		offers.add(offer);
		OfferFilter offerFilter = new OfferFilterBean(offers);
		Cart cart = new CartBean(taxable, offerFilter);
		cart.addToCart(product1, 3);
		System.out.println(cart);
		assertEquals(3, cart.getCartDetails().get(product1).intValue());
		assertEquals(10.00, cart.getTaxOnCartTotal());
		assertEquals(39.99, cart.getDiscountOnCartTotal());
		assertEquals(89.98, cart.getCartTotal());
	}

}
