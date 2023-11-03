package patternZoho;

import java.util.Scanner;

public class DiamondPattern {

	public static void print(){
		//output: 	*
		//			**
		//		    * *
		//	      	*  *
		//	     	*   *
		//		    *  *
		//			* *
		//			**
		//			*
		System.out.println("-------DiamondPattern----------");
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter size n:");
		int n = input.nextInt();
		
		for(int i=0; i<2*n; i++) {
			//skip the bottom row
			if(i==2*n/2) {
				continue;
			}
			for(int j=0; j<=i; j++) {
				if(j==0 || i==j && i<5 || (i+j==n*2-1 && i>=5)) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
