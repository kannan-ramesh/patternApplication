package patternZoho;

import java.util.Scanner;

public class LeftTrianglePascal {

    public static void print() {
    	System.out.println("--------LeftTrianglePascal------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size n:");
        int n = input.nextInt();

        // Print the first half of the pattern
        for (int i = 0; i <n; i++) {
            for (int k = n - 1; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the second half of the pattern
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if (j == n-1|| i==j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
