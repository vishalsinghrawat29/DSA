import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int n){      
        int rev= 0;
        for(int i = n; i!=0; i/=10){
            int lastDigit = i%10;
            rev = rev*10 + lastDigit;
        }
        if(rev == n){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num + " is Plaindrome");
        }else{
            System.out.println(num + " is not a plaindrome");
        }
        sc.close();
    }
}
