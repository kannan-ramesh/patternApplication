package patternZoho;

import java.util.Scanner;

public class Pattern14 {

	public static void print() {
		System.out.println("------Pattern14----");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n");
		int n=input.nextInt();
		
		int star = 0;
		int space = n-2;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0;j<=star;j++) {
				System.out.print("*");
			}
			for(int j=space;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=star;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			//increase pattern
			if(i<n/2-1) {
				star+=1;
				space-=2;
			}
//			//equal of index
			if(i == n/2-1) {
				space=2;
				star -= 1;
			}
//			//decrease pattern
			if(i>n/2) {
				star -= 1;
				space += 2;
			}
		}

	}

}
