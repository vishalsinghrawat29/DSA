
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Increasing Letter Triangle Pattern
 * 
 * Problem:
 * Print a Increasing Letter Triangle Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * A
 * A B
 * A B C
 * A B C D
 * 
 * ========================================
 */

public class Pattern14 {
    public static void increasingLetterTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            increasingLetterTriangle(n);
        }
    }

}
