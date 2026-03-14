
import java.util.Scanner;

public class Problem02 {
    public static int reverseInteger(int num) {
        int reverseNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            if (reverseNum < Integer.MIN_VALUE || reverseNum > Integer.MAX_VALUE) {
                return 0;
            }
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }

        return reverseNum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            System.out.println("Reverse num: " + reverseInteger(n));

        }
    }

}
