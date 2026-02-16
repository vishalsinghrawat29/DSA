
/*
 * ========================================
 * Pattern: Reverse Letter Triangle Pattern
 * 
 * Problem:
 * Print a Reverse Letter Triangle Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * A B C D
 * A B C
 * A B
 * A
 * 
 * ========================================
 */

import java.util.Scanner;

public class Pattern15 {
    public static void ReverseLetterTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            ReverseLetterTriangle(n);
        }
    }

}
