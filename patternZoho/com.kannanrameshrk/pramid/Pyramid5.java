package pramid;

import java.util.Scanner;

public class Pyramid5 {

	public static void print() {

		Scanner input = new Scanner(System.in);
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		
		 for (int i = 1; i <= n; i++) {
			 //print space
			 for(int j=i;j<n;j++) {
				 System.out.print(" ");
			 }
	            // Print the first part of the row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Print the second part of the row (in reverse order)
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }
	       System.out.println();
		 }

	}

}
