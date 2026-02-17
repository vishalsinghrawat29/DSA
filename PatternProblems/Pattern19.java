
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Symmetric-Void Pattern
 * 
 * Problem:
 * Print a Symmetric-Void Pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * * * * * * * * * * *
 * * * * *     * * * *
 * * * *         * * *
 * * *             * *
 * *                 *
 * *                 *
 * * *             * *
 * * * *         * * *
 * * * * *     * * * *
 * * * * * * * * * * *
 * ========================================
 */

public class Pattern19 {
    public static void symmetricVoidPattern(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i <= n) {
                    if (j <= n - i + 1 || j > n + i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j <= i - n || j > 3 * n - i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            symmetricVoidPattern(n);
        }
    }

}
