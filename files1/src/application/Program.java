package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String outPath = "/home/eduardo/testefile/out/summary.csv";
		
		System.out.print("Insert some file path: ");
		String strPath =  sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			
			while (line != null) {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath, true))){
					String[] splittedString = line.split(", ", 6);
					double totalPrice = Double.parseDouble(splittedString[1]) * Double.parseDouble(splittedString[2]);
					bw.write(splittedString[0] + ", " + String.format("%.2f",totalPrice));
					bw.newLine();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
