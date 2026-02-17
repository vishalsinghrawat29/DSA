
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Hollow Square Pattern
 * 
 * Problem:
 * Print a Hollow Square Pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * * * * * * 
 * *       *
 * *       *
 * *       *
 * * * * * * 
 * ========================================
 */
public class Pattern21 {
    public static void hollowSqaurePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
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
            hollowSqaurePattern(n);
        }
    }

}
