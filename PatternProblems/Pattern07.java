
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Star Pyramid Pattern
 * 
 * Problem:
 * Print a star pyramid pattern of size n.
 * 
 * Example:
 * Input: n = 3
 * 
 * Output:
 *     * 
 *   * * *
 * * * * * *
 * 
 * ========================================
 */
public class Pattern07 {
    public static void starPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n - i + 1 && j <= n + i - 1) {
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
            starPyramid(n);
        }
    }

}
