import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum = a+b;
         System.out.print("Sum of "+ a + " and " + b + " : "+ sum);
         sc.close();
    }
}
