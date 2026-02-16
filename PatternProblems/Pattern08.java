
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Inverted Star Pyramid Pattern
 * 
 * Problem:
 * Print a inverted star pyramid pattern of size n.
 * 
 * Example:
 * Input: n = 3
 * 
 * Output:
 * * * * * *
 *   * * *
 *     * 
 * 
 * ========================================
 */

public class Pattern08 {
    public static void invertedStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= i && j <= 2 * n - i) {
                    System.out.print("* ");
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
            invertedStarPyramid(n);

        }
    }

}
