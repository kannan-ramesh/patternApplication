package patternZoho;

import java.util.Scanner;

public class Pattern13 {

	public static void print() {
		System.out.println("--------Pattern13------");
		Scanner input = new Scanner(System.in);
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		
		for(int i=0; i<2*n; i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i+j==n-1 || i==j || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
//				for(int k=1;k<=i;k++) {
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}
	}

}
