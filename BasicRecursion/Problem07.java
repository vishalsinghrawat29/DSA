import java.util.Scanner;

public class Problem07 {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isOptimizedPalindrome(int i, String str) {
        if (i > str.length() / 2)
            return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1))
            return false;
        return isOptimizedPalindrome(i + 1, str);
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter String: ");
            String str = sc.nextLine();

            System.out.println(str + " is " +
                    (isPalindrome(str) ? "palindrome" : "not palindrome"));
            System.out.println(str + " is " +
                    (isOptimizedPalindrome(0, str) ? "palindrome" : "not palindrome"));
        }
    }
}