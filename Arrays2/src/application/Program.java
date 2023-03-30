package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = number;
		}
		
		double sum = 0.0;
		
		System.out.printf("Valores = ");
		
		for(int i = 0; i < vect.length; i ++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];
		}
		
		System.out.printf("\nSOMA = %.2f%n", sum);
		
		double avg = sum / n;
		
		System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();
	}

}
