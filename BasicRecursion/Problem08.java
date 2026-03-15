
import java.util.Scanner;

public class Problem08 {
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int current = Fibonacci(n - 1) + Fibonacci(n - 2);
        return current;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num :");
            int n = sc.nextInt();
            System.out.println(n + "th Fibonacci num : " + Fibonacci(n));
        }
    }

}
