import java.util.Scanner;

public class DigitSum {

    public static int sumDigit(int n){
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n =  n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Digits sum of "+ num + " : " + sumDigit(num));

        sc.close();
    }
}
