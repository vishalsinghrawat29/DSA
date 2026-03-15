
import java.util.Scanner;

public class Problem04 {
    public static int sumNum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNum(n - 1);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter num: ");
            int n = sc.nextInt();
            int sum = sumNum(n);
            System.out.println("Total Sum: " + sum);
        }
    }

}
