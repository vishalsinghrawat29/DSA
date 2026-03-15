
import java.util.Scanner;

public class Problem01 {
    public static void printName(String name, int n) {
        if (n < 1) {
            return;
        }
        System.out.println(name);
        printName(name, n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("No. of Times: ");
            int n = sc.nextInt();
            printName(name, n);
        }
    }
}