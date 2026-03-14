
import java.util.Scanner;

public class Problem04 {
    public static boolean isArmstrong(int n) {
        int digits = String.valueOf(n).length();
        int sum = 0, temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Num: ");
            int n = sc.nextInt();
            System.out.println(n + " is " + (isArmstrong(n) ? "armstrong" : "not armstrong") + " number.");
        }
    }

}
