package patternZoho;

import java.util.Scanner;

public class StarPattern {
	//output: *****
	//		  *****
	//		  *****
	//		  *****
	//		  *****
	public static void print() {
		System.out.println("------StarPattern----");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n= input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
