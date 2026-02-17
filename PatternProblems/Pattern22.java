
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Number Pattern
 * 
 * Problem:
 * Print a Number Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * 4 4 4 4 4 4 4
 * 4 3 3 3 3 3 4
 * 4 3 2 2 2 3 4
 * 4 3 2 1 2 3 4
 * 4 3 2 2 2 3 4
 * 4 3 3 3 3 3 4
 * 4 4 4 4 4 4 4
 * ========================================
 */

public class Pattern22 {
    public static void numberPattern(int n) {
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                int top = i - 1;
                int left = j - 1;
                int bottom = 2 * n - 1 - i;
                int right = 2 * n - 1 - j;

                int min = top;

                if (left < min)
                    min = left;
                if (bottom < min)
                    min = bottom;
                if (right < min)
                    min = right;

                System.out.print((n - min) + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner((System.in))) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            numberPattern(n);
        }
    }

}
