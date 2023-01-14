import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Postive Number");
        }
        sc.close();
    }
}
