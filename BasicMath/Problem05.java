
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem05 {
    public static void divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        Collections.reverse(list);

        for (int x : list) {
            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Num: ");
            int n = sc.nextInt();
            divisors(n);
        }
    }

}
