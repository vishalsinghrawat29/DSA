import java.util.Scanner;

/*
========================================
Pattern: Square Star Pattern

Problem:
Print a square star pattern of size n.

Example:
Input: n = 4

Output:
* * * *
* * * *
* * * *
* * * *

========================================
*/

public class Pattern01 {

    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size: ");
            int n = sc.nextInt();
            printSquare(n);
        }
    }
}
