import java.util.Scanner;

public class Even {
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if(isEven(num)){
            System.out.println(num + " is Even number");
        }else{
            System.out.println(num + " is Odd number");
        }
        sc.close(); 
    }
}
