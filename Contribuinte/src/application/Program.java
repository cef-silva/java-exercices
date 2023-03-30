package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> contribuintes = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double gastoSaude = sc.nextDouble();
				Contribuintes contribuinte = new PessoaFisica(nome, rendaAnual, gastoSaude);
				contribuintes.add(contribuinte);
			}
			else {
				System.out.print("Number of employess: ");
				int numFunc = sc.nextInt();
				Contribuintes contribuinte = new PessoaJuridica(nome, rendaAnual, numFunc);
				contribuintes.add(contribuinte);
			}
		}
		
		System.out.println("TAXES PAID:");
		for(Contribuintes cont : contribuintes) {
			System.out.println(cont.getNome() + String.format(": %.2f%n", cont.calcImposto()));
		}
		
		double sum = 0.0;
		
		for(Contribuintes cont : contribuintes) {
			sum += cont.calcImposto();
		}
		
		System.out.printf("TOTAL TAXES: %.2f%n", sum);
		
		sc.close();
	}

}
