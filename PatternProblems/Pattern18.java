
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Alpha-Triangle Pattern
 * 
 * Problem:
 * Print a Alpha-Triangle Pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 * 
 * ========================================
 */
public class Pattern18 {
    public static void alphaTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            alphaTrianglePattern(n);
        }
    }

}
