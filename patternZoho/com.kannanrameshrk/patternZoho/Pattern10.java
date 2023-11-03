package patternZoho;

import java.util.Scanner;

public class Pattern10 {

	public static void print() {
		System.out.println("---Pattern10----");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n = input.nextInt();
		
		int star = n/2+1;
		int space = 0;
		
		for(int i=1;i<=n; i++) {
			//leftside star
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			//space 
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//rightside star
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			//increase pattern
			if(i<n/2+1) {
				star-=1;
				space+=2;
			}
			//equal of index
			if(i == n/2+1) {
				space=n-3;
				star = 2;
			}
			//decrease pattern
			if(i>n/2+1) {
				star += 1;
				space -= 2;
			}
			
		}

	}

}
