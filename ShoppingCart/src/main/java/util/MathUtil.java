package main.java.util;

public class MathUtil {
	/**
	 * Round of the decimal value to given precision
	 * 
	 * @param value
	 *            decimal value which need to round of.
	 * @param places
	 *            decimal precision
	 * @return decimal value with given precision.
	 */
	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		long factor = (long) Math.pow(10, places);
		value = value * factor;
		long tmp = Math.round(value);
		return (double) tmp / factor;
	}
}
