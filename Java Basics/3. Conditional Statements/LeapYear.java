import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();
        boolean x = year%4 == 0;
        boolean y = year%100 != 0;
        boolean z =((year%100) == 0) &&  ((year%400) == 0);
        if(x && (y || z)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
}
