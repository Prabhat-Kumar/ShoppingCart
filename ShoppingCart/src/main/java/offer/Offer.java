package main.java.offer;

import main.java.cart.Product;

public class Offer {

	private Product product;
	private int totalQuantity;
	private int pricedQuantity;

	public Offer(Product product, int totalQuantity, int pricedQuantity) {
		this.product = product;
		this.totalQuantity = totalQuantity;
		this.pricedQuantity = pricedQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public int getPricedQuantity() {
		return pricedQuantity;
	}

}
