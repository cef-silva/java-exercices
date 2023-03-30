package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					if(i > 0) {
						System.out.printf("Acima: %d%n", mat[i - 1][j]);
					}
					if(i < mat.length-1) {
						System.out.printf("Abaixo: %d%n", mat[i + 1][j]);
					}
					if(j > 0) {
						System.out.printf("Esquerda: %d%n", mat[i][j - 1]);
					}
					if(j < mat.length-1) {
						System.out.printf("Direita: %d%n", mat[i][j + 1]);
					}			
				}
			}
		}

		sc.close();
	}

}
