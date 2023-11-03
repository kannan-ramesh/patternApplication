package patternZoho;

import java.util.Scanner;

public class Box {
	//output: 	  *****
		//		  *   *
		//		  *   *
		//		  *   *
		//		  *****
	public static void print() {
		System.out.println("--------Box Pattern------");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n= input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==n-1|| i==n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
