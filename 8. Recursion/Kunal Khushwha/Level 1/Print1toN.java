public class Print1toN{
    public static void nto1Rev(int n) {
        if (n==1) {
            System.out.println(1);
            return;
        }
        nto1Rev(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        nto1Rev(5);
    }
}