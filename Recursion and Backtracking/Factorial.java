import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
        int num = scanner.nextInt();
        scanner.close();
        int factorial = factorial(num);
        System.out.println("Factorial of "+ num + " is: " + factorial);
    }
    public static int factorial(int num){
        if(num == 1){
            return 1;
        }else {
            return num * factorial(num - 1);
        }
    }
}
