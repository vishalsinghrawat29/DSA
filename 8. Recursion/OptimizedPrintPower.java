public class OptimizedPrintPower {
    public static int optmizedPower(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = optmizedPower(x, n/2);
        int halfPowerSq = halfPower*halfPower;

        // n is odd
        if (n%2 != 0){
            halfPowerSq = x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a =2;
        int n =5;
        System.out.println(optmizedPower(a, n));
    }
}
