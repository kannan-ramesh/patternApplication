package patternZoho;

import java.util.Scanner;

public class HollowRightTriangle {

	public static void print() {
		//output:    *****
		//			*   *
		//		   *   *
		//	      *   *
		//	     *****
		System.out.println("----HollowRightTriangle-----");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size n:");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			//print space
			for(int k=i; k<n;k++) {
				System.out.print(" ");
			}
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

	}

}
