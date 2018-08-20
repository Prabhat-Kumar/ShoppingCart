package main.java.cart;

import java.util.HashMap;
import java.util.Map;

import main.java.offer.OfferFilter;
import main.java.tax.Taxable;
import main.java.util.MathUtil;

public class CartBean implements Cart {
	
	protected double cartTotal;
	protected double discount;
	protected double tax;
	protected Map<Product, Integer> items;
	
	private Taxable taxable;
	private OfferFilter offerFilter;

	public CartBean(Taxable taxable, OfferFilter offerFilter) {
		this.taxable = taxable;
		this.offerFilter = offerFilter;
		this.items = new HashMap<Product, Integer>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.java.cart.Cart#getItems()
	 */
	@Override
	public Map<Product, Integer> getCartDetails() {
		return items;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.java.cart.Cart#addToCart(main.java.cart.Product, java.lang.Integer)
	 */
	@Override
	public void addToCart(Product item, Integer quantity) {
		if (!items.containsKey(item)) {
			items.put(item, quantity);
		} else {
			items.put(item, items.get(item) + quantity);
		}
		cartTotal += item.getPrice() * quantity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see main.java.cart.Cart#getTotal()
	 */
	@Override
	public double getCartTotal() {
		return MathUtil.round(cartTotal-getDiscountOnCartTotal()+getTaxOnCartTotal(), 2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String displayCart = "";
		System.out.println("Product |  Price  | quantity |  Total Price");
		for (Map.Entry<Product, Integer> entry : items.entrySet()) {
			displayCart += entry.getKey().getName() + "       " + entry.getKey().getPrice() + "        " + entry.getValue() + "        " + MathUtil.round(entry.getKey().getPrice() * entry.getValue(), 2) + "\n";
		}
		displayCart += "\n Tax: " + MathUtil.round(getTaxOnCartTotal(), 2);
		displayCart += "\n Discount: " + MathUtil.round(getDiscountOnCartTotal(), 2);
		displayCart += "\n Total: " + MathUtil.round(cartTotal, 2);
		return displayCart;
	}

	/* (non-Javadoc)
	 * @see main.java.cart.Cart#getTaxOnCartTotal()
	 */
	@Override
	public double getTaxOnCartTotal() {
		if (taxable == null) {
			return 0;
		}
		return Math.round(taxable.getCalculateTax(this.cartTotal - getDiscountOnCartTotal()));
	}

	/* (non-Javadoc)
	 * @see main.java.cart.Cart#getDiscountOnCartTotal()
	 */
	@Override
	public double getDiscountOnCartTotal() {
		if (offerFilter == null) {
			return 0;
		}
		return offerFilter.getDiscount(this);
	}
}
