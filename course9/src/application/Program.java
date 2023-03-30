package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int k = 0;
		
		System.out.println("Main diagonal:");
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i==j) {
					System.out.print(mat[i][j] + " ");
				}
				
				if(mat[i][j] < 0) {
					k++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + k);
		
		sc.close();
	}

}
