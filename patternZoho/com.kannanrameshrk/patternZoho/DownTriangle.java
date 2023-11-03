package patternZoho;

import java.util.Scanner;

public class DownTriangle {

	public static void print() {
		//output: *********
		//         *     *
		//          *   *
		//           * *
		//            *
		System.out.println("-------DownTriangele-------");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of n:");
		int n = input.nextInt();
			
		 for (int i=n; i>= 1 ; i--)
		    {
		        for (int j = i; j < n ; j++) {
		            System.out.print(" ");
		        }   
		        
		        for (int k = 1; k <= (2*i -1) ;k++) {
		            if( k==1 || i == n || k==(2*i-1)) {
		                System.out.print("*");
		            }
		            else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println("");
		    }
		

	}

}
