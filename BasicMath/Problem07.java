
import java.util.Scanner;

public class Problem07 {
    public static int findGCD(int n1, int n2) {
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int findGCDEuclidean(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Num1: ");
            int n1 = sc.nextInt();
            System.out.print("Enter Num2: ");
            int n2 = sc.nextInt();

            System.out.println("GCD : " + findGCD(n1, n2));
            System.out.println("GCD with findGCDEuclidean : " + findGCDEuclidean(n1, n2));

        }
    }

}
