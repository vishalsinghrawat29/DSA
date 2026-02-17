
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Symmetric-Butterfly Pattern
 * 
 * Problem:
 * Print a Symmetric-Butterfly Pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * *                 *
 * * *             * *
 * * * *         * * *
 * * * * *     * * * *
 * * * * * * * * * * * 
 * * * * *     * * * *
 * * * *         * * *
 * * *             * *
 * *                 *
 * ========================================
 */
public class Pattern20 {
    public static void symmetricButterflyPattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i <= n) {
                    if (j <= i || j >= 2 * n - i + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j < 2 * n - i + 1 || j > i) {
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
            symmetricButterflyPattern(n);
        }
    }

}
