
import java.util.Scanner;

public class Problem02 {
    public static void printNum(int n, int count) {
        if (count > n) {
            return;
        }
        System.out.println(count);
        printNum(n, count + 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            printNum(n, 1);
        }
    }

}
