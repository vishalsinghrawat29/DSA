
import java.util.Scanner;

public class Problem05 {
    public static int numFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * numFactorial(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Num: ");
            int n = sc.nextInt();
            System.out.println("Factorial: " + numFactorial(n));
        }
    }

}
