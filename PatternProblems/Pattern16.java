
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Alpha-Ramp Pattern
 * 
 * Problem:
 * Print a Alpha-Ramp Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * A
 * B B
 * C C C
 * D D D D
 * 
 * ========================================
 */
public class Pattern16 {
    public static void alphaRampPattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            alphaRampPattern(n);
        }
    }

}
