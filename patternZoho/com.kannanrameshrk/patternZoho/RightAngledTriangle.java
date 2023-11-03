package patternZoho;

import java.util.Scanner;

public class RightAngledTriangle {
	//output
	//*****
	// *  *
	//  * *
	//   **
	//    *
	
	

	public static void print() {
		System.out.println("-----RightAngledTriangle----");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size of n:");
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==j || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
