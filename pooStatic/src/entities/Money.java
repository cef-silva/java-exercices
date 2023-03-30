package entities;

public class Money {
	public static final double IOF = 0.06;
	
	public static double valueToBePaid(double price, double amount) {
		return price * (amount + IOF * amount);
	}
}
