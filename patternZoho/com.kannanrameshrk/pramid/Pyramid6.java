package pramid;

import java.util.Scanner;

public class Pyramid6 {

	public static void print() {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
