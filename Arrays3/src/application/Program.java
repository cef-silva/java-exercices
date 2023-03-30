package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitas? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Dados da %da pessoa: ", i+1);
			System.out.print("\nNome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Person(nome, idade, altura);
		}
		
		double heightSum = 0.0;
		double j = 0;
		
		for(int i = 0; i < vect.length; i ++) {
			heightSum += vect[i].getAltura();
			if(vect[i].getIdade() < 16) {
				j += 1;
			}
		}
		
		double porcentagem = (j / vect.length) * 100;
		
		double avg = heightSum / n; 
		
		System.out.printf("Altura media: %.2f%n", avg);
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", porcentagem);
		for(int i = 0; i < vect.length; i ++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		
		}
		
		sc.close();
	}

}
