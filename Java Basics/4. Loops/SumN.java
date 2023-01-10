import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;
        int sum =0;
        while(counter<=range){
            sum +=counter;
            counter++;
        }
        System.out.println(sum);
        sc.close();
    }
}
