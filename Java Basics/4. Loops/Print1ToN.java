import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        int counter = 1;
        while(counter<=range){
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
}
