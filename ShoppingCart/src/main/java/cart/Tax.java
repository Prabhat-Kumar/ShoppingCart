package main.java.cart;

public class Tax {

	private static final double RATE = 12.5 / 100;

	/**
	 * Calculate tax on the given amount.
	 * 
	 * @param amount
	 *            amount.
	 * @return tax on amount.
	 */
	public static double calculateTax(double amount) {
		return amount * RATE;
	}
}
