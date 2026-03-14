
import java.util.Scanner;

public class Problem03 {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num = num / 10;
        }
        return reverseNum == originalNum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            System.out.println(n + (isPalindrome(n) ? " is palindrome" : " is not palindrome"));
        }
    }

}
