
import java.util.Scanner;

public class Problem01 {
    public static int countDigitOfNum(int n) {
        int digit = 0;

        if (n == 0) {
            return digit;
        }
        if (n < 0) {
            n = -n;
        }
        while (n != 0) {
            n /= 10;
            digit++;
        }

        return digit;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            System.out.println("Count Digit in Number: " + countDigitOfNum(n));
        }

    }

}
