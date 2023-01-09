import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 25;
        long b = a;
        System.out.println(b);


        // Type Casting
        float c = 25.12f;
        int d = (int) c;
        System.out.println(d);


        //Type Promotion
        char e = 'a';
        char f ='b';
        System.out.println(e-f);
        System.out.println(e);
        System.out.println(f);


        short g = 5;
        byte h =25;
        char i = 'c';
        byte bt = (byte) (g + h + i);
        System.out.println(bt);


        int j = 10;
        float k =20.25f;
        long l = 85;
        double o = 35;
        double  ans = j + k + l + o ;
        System.out.println(ans);






        
    }
}
