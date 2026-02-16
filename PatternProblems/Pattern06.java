
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Inverted Right-Numbered Pyramid Pattern
 * 
 * Problem:
 * Print a inverted numbered right pyramid pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * ========================================
 */

public class Pattern06 {
    public static void invertedRightNumPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            invertedRightNumPattern(n);
        }

    }
}