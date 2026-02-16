
import java.util.Scanner;

/*
 * ========================================
 * Pattern: Increasing Number Triangle Pattern
 * 
 * Problem:
 * Print a Number Crown Pattern of size n.
 * 
 * Example:
 * Input: n = 4
 * 
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 * ========================================
 */

public class Pattern13 {
    public static void increasingNumTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            increasingNumTriangle(n);
        }
    }

}
