package pramid;

import java.util.Scanner;

public class Pyramid1 {

	public static void print() {
		Scanner input = new Scanner(System.in);
		System.out.println("ENter size of n:");
		int n = input.nextInt();
		
		for(int i=1;i<=n-1;i++) {
			for(int k=n;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
