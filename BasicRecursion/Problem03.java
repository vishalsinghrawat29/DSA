import java.util.Scanner;

public class Problem03 {
    public static void printNum(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Num: ");
            int n = sc.nextInt();
            printNum(n);
        }
    }

}
