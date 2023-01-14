import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        int choice;
        do{
            System.out.println("Enter Number: ");
            int n = sc.nextInt();
            if(n%2 ==0){
                even+=n;
            }else{
                odd+=n;
            }
            System.out.println("Did You want to continue ? Press 1 for yes and 0 for No");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Sum of Even Number: "+ even);
        System.out.println("Sum of Odd Number: "+ odd);

        sc.close();
    }
}
