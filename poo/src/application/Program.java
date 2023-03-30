package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		double areaRectangle = rectangle.area();
		double perimeterRectangle = rectangle.perimeter();
		double diagonalRectangle = rectangle.diagonal();
		
		System.out.printf("AREA = %.2f%n", areaRectangle);
		System.out.printf("PERIMETER = %.2f%n", perimeterRectangle);
		System.out.printf("DIAGONAL = %.2f%n", diagonalRectangle);
		sc.close();
	}

}
