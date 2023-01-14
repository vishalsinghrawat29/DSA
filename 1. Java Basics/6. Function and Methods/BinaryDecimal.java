import java.io.ObjectInputFilter.Status;

public class BinaryDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int MyNum = binNum;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + lastDigit*(int)Math.pow(2, pow);
            pow++;
            binNum /=10;
        }
        System.out.println("Decimal of "+ MyNum + " = " + decNum);
    }

    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int MyNum = n;
        while(n>0){
            int rem = n%2;
            binNum = binNum + rem*(int)Math.pow(10, pow);
            pow++;
            n /=2;
        }
        System.out.println("Binary of "+ MyNum + " = " + binNum);
        
    }

    public static void main(String[] args) {
        binToDec(101);
        decToBin(5);
    }
}
