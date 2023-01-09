import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter cost of pen: ");
        float pen = sc.nextFloat();
        System.out.println("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float TotalPrice = eraser + pencil + pen;
        float GSTCost = 0.18f * TotalPrice;
        float NetPrice = TotalPrice + GSTCost;
        System.out.println("Total Price After GST is " + NetPrice);
        sc.close();

    }
}
