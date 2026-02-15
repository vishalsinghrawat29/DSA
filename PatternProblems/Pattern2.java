
import java.util.Scanner;

/*
========================================
Pattern: Right-Angled Triangle Star Pattern

Problem:
Print a right angle Triangle star pattern of size n.

Example:
Input: n = 4

Output:
* 
* * 
* * * 
* * * *

========================================
*/

public class Pattern2 {
    public static void rightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            rightAngleTriangle(n);
        }

    }

}
