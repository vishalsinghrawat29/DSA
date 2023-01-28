public class StaircaseWays {
    public static int countStaircaseWays(int n){

        // base case 
        if (n < 0) {
            return 0;
        }
        if (n== 0) {
            return 1;
        }

        // recursive call

        int ans =  countStaircaseWays(n-1) + countStaircaseWays(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countStaircaseWays(n));
    }
}
