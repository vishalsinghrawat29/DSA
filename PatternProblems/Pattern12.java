
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Number Crown Pattern
 * 
 * Problem:
 * Print a Number Crown Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * 1             1
 * 1 2         2 1
 * 1 2 3     3 2 1
 * 1 2 3 4 4 3 2 1
 * 
 * ========================================
 */

public class Pattern12 {

    public static void numCrownPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else if (j > 2 * n - i) {
                    System.out.print((2 * n - j + 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            numCrownPattern(n);
        }
    }

}
