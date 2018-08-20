package main.java.tax;

import main.java.cart.Cart;

public class TaxableBean implements Taxable{

	@Override
	public double getCalculateTax(double amount) {
		return amount*12.5/100;
	}

}
