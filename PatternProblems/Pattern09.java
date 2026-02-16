
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Diamond Star Pattern
 * 
 * Problem:
 * Print a Diamond star pattern of size n.
 * 
 * Example:
 * Input: n = 3
 * 
 * Output:
 *     * 
 *   * * *
 * * * * * *
 * * * * * *
 *   * * *
 *     * 
 * 
 * ========================================
 */

public class Pattern09 {
    public static void diamondStarPattern(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i <= n) {
                    if (j >= n - i + 1 && j <= n + i - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (j >= i - n && j <= 3 * n - i) {
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
            System.out.print("Enter Size: ");
            int n = sc.nextInt();
            diamondStarPattern(n);
        }
    }

}
