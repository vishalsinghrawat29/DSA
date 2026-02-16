
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Half Diamond Star Pattern
 * 
 * Problem:
 * Print a Half Diamond star pattern of size n.
 * 
 * Example:
 * Input: n = 3
 * 
 * Output:
 * * 
 * * *
 * * * *
 * * * 
 * * 
 * 
 * ========================================
 */

public class Pattern10 {
    public static void halfDiamondStarPattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars;

            if (i < n) {
                stars = i + 1;
            } else {
                stars = 2 * n - i - 1;
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            halfDiamondStarPattern(n);
        }
    }

}
