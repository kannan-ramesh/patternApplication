package pramid;

import java.util.Scanner;

public class Pyramid3 {

	public static void print() {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		
		for(int i=n-1;i>=0;i--) {
			for(int k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
