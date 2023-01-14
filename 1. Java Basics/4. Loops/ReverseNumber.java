import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 290698;

        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
}
