public class PrintNto1toN {
    public static void nto1toN(int n) {
        if (n==1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        nto1toN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        nto1toN(5);
    }
}
