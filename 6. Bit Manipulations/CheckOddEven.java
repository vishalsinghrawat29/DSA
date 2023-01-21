public class CheckOddEven {
    public static void isOddEven(int n){
        int bitMask = 1;
        if ((n&bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        isOddEven(3);
        isOddEven(11);
        isOddEven(14);
    }
}
