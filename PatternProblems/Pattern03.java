
import java.util.Scanner;

/*
========================================
Pattern: Right-Angled Number Pyramid

Problem:
Print a Right-Angled Number Pyramid of size n.

Example:
Input: n = 4

Output:
1 
1 2 
1 2 3 
1 2 3 4

========================================
*/

public class Pattern03 {
    public static void rightAngleNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
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
            rightAngleNumberPyramid(n);
        }
    }
}
