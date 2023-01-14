import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of number: " + factorial);

        sc.close();
    }
}
