
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Binary Number Triangle Pattern
 * 
 * Problem:
 * Print a Binary Number Triangle Pattern of size n.
 * 
 * Example:
 * Input: n = 5
 * 
 * Output:
 * 1 
 * 0 1
 * 1 0 1
 * 0 1 0 1 
 * 1 0 1 0 1 
 * 
 * ========================================
 */

public class Pattern11 {
    public static void binaryNumTrianglePattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            binaryNumTrianglePattern(n);
        }
    }

}
