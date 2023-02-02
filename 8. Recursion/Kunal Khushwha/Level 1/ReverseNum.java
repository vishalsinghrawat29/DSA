public class ReverseNum {
    // way 1
    static int sum = 0;
    public static void revNum1(int n) {
        if (n==0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        revNum1(n/10);
        
    }

    // way 2
    static int revNum2(int n) {
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n, digit);        
    }
    private static int  helper(int n, int digit) {
        if (n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
    public static void main(String[] args) {
        revNum1(1432);
        System.out.println(sum);
        System.out.println(revNum2(1562));
    }
}
