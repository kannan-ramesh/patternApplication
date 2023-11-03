package patternZoho;

import java.util.Scanner;

public class DiamondStar {

	public static void print() {
		//ouput:       *
		//			  * *
		//			 *   *
		//		    *     *
		//		   *       *
		//			*     *
		//           *   *
		//			  * *
		//			   *
		System.out.println("----------DiamondStar----------");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n= input.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Enter odd number:");
			return;
		}
		
		int outerSpace = n/2;
		int insideSpace = 1;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<outerSpace; j++) {
				System.out.print(" ");
			}
			if(i<n/2) {
				outerSpace-=1;
			}else {
				outerSpace+=1;
			}
			
			if(i==0 || i==n-1) {
				System.out.println("*");
			}else {
				System.out.print("*");
				
				for(int j=0; j<insideSpace;j++) {
					System.out.print(" ");
				}
				if(i<n/2) {
					insideSpace+=2;
				}else {
					insideSpace-=2;
				}
				System.out.println("*");
			}
		}
		
	}

}
