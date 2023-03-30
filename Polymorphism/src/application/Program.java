package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			Product product;
			
			switch(c) {
				case 'c':
					product = new Product(name, price);
					products.add(product);
					break;
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					product = new ImportedProduct(name, price, customsFee);
					products.add(product);
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					product = new UsedProduct(name, price, manufactureDate);
					products.add(product);
					break;
				default:
					System.out.println("Valor invalido");
					break;
			}
		}
		
		for(Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
