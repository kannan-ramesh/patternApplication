package patternZoho;

import java.util.Scanner;

public class LeftAngledTriangle {

	public static void print() {
		//output: *****
		//		  *  *
		//        * *
		//        **
		//        *
		System.out.println("-------LeftAngleTriangle----------");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size n:");
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i+j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
