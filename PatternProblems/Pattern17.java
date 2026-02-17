
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Alpha-Hill Pattern
 * 
 * Problem:
 * Print a Alpha-Hill Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 *       A
 *     A B A
 *   A B C B A
 * A B C D C B A
 * 
 * ========================================
 */

public class Pattern17 {
    public static void alphaHillPattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n - i + 1 && j <= n + i - 1) {
                    System.out.print(ch + " ");
                    if (j < n) {
                        ch++;
                    } else {
                        ch--;
                    }
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
            alphaHillPattern(n);
        }
    }

}
