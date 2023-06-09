package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		Shape shape;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next()); 
			if(ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shape = new Rectangle(color, width, height);
				shapes.add(shape);
			}
			
			if(ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shape = new Circle(color, radius);
				shapes.add(shape);
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape s : shapes) {
			System.out.printf(String.format("%.2f%n",s.area()));
		}
		
		sc.close();
	}

}
