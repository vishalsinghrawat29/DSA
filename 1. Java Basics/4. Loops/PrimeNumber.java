import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n==2){
            System.out.println("Prime Number");
        }else{
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
        }
        sc.close();
    }
}
