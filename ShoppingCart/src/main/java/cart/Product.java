package main.java.cart;

public class Product {
	private String name;
	private double price;

	/**
	 * Product constructor with name and price of the product.
	 * 
	 * @param name
	 *            product's name.
	 * @param price
	 *            product's price.
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/**
	 * Get price of the product.
	 * 
	 * @return product price.
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * Get name of the product.
	 * 
	 * @return product name.
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [price=" + price + "]";
	}

}
