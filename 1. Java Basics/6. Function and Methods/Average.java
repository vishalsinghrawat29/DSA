import java.util.Scanner;

public class Average {
    public static double average(double a, double b, double c){
        double avg = (a*b*c)/3;
        return avg; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        System.out.println("Enter third number");
        double num3 = sc.nextDouble();
        System.out.println("Average of "+ num1 + "," + num2 + "," + num3 + " : " + average(num1, num2, num3));
        sc.close();
    }
}
