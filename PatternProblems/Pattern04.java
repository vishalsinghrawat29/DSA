
import java.util.Scanner;

/*
========================================
Pattern: Right-Angled Number Pyramid II

Problem:
Print a Right-Angled Number Pyramid II of size n.

Example:
Input: n = 4

Output:
1 
2 2 
3 3 3 
4 4 4 4

========================================
*/

public class Pattern04 {
    public static void rightAngleNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
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
