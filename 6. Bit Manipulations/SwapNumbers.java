public class SwapNumbers {
    public static void swap(int a, int b){
        System.out.println("Before Swap: a:" + a + " b:" + b);
        // a = a+b;
        // b = a-b;
        // a=  a-b;

        // with bit manuplations
        a =a^b;
        b =a^b;
        a =a^b;
        System.out.println("After Swap: a:" + a + " b:" + b);
    }
    public static void main(String[] args) {
        swap(3, 4);
    }
}
