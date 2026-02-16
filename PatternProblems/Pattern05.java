
import java.util.Scanner;

/*
========================================
Pattern: Inverted Right-Angled Triangle Star Pattern

Problem:
Print a inverted right angle Triangle star pattern of size n.

Example:
Input: n = 4

Output:
* * * *
* * * 
* * 
* 

========================================
*/

public class Pattern05 {
    public static void invertedRightAngleStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
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
            invertedRightAngleStarPattern(n);
        }
    }

}
