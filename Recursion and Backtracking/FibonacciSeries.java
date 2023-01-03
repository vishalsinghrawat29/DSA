import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the nth fibonacci number");
        int num = scanner.nextInt();
        if(num<=0){
            System.out.println("Invalid Number!!");
            System.out.println("Please enter number greater than 0");
        }else {
            //find nth fibonacci number
            int fibNumber = fibonacci(num);
            System.out.println(num + "th fibonacci number is: " + fibNumber);

            //print fibonacci series
            printfib(num);
        }

    }
    public static int fibonacci(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void printfib(int num){
        int n = 1;
        int n_1 = 0;
        System.out.print("0 | 1 | ");
        for(int i = 2 ; i<num;i++) {
            int temp = n + n_1;
            n_1 = n;
            n = temp;
            System.out.print(n + " | ");
        }

//        int fibSeries[] = new int[num];
//        fibSeries[0] = 0;
//        fibSeries[1] = 1;
//        for(int i = 0 ; i<num;i++){
//            if(i<=1){
//                System.out.print(fibSeries[i] + " ");
//            }else{
//                fibSeries[i] = fibSeries[i-1] + fibSeries[i-2];
//                System.out.print(fibSeries[i] + " ");
//            }
//        }
    }
}
