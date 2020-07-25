/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tukitaki;

import java.util.Scanner;

public class triangle {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Rows to print");
		int rows = s.nextInt();
		System.out.println("Enter Number of Columns to print");
		int cols = s.nextInt();
 
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.print("*");
			}
			if (i != rows) {
				System.out.println();
			}
		}
		s.close();
	}
}