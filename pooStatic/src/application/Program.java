package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Money;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double valueInReais = Money.valueToBePaid(price, amount);
		System.out.printf("Value to be paid in reais: %.2f%n", valueInReais);
		
		sc.close();
	}

}
