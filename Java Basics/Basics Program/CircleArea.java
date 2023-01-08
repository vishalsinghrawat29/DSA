import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextInt();
        float area = 3.14f*rad*rad;
        System.out.print("Area of circle is  "+ area);
        sc.close();
    }
}
