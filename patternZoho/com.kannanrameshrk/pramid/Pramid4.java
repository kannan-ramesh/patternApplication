package pramid;

import java.util.Scanner;

public class Pramid4 {
//			9
//		   898
//		  78987
//		 6789876
//		567898765
//	   45678987654
//	  3456789876543
//	 234567898765432
//	12345678987654321

	public static void print() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		int k=n;
		
		for (int i = n; i > 0; i--) {
			 //print space
			 for(int j=0; j<i; j++) {
				 System.out.print(" ");
			 }
	          // Print the first part of the row	
	         for (int j = i; j <n; j++) {
	        	 System.out.print(j);
	         }   
	         // Print the second part of the row (in reverse order)
	         for (int j = k; j >= i; j--) {
	              System.out.print(j);
	         }
	       System.out.println();
		 }
	}
}