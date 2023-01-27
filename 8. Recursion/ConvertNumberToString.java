public class ConvertNumberToString {
    public static void makeString(int n){
        String engNum[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n == 0) {
            return;
        }

        // kaam
        int lastDigit = n%10;
        makeString(n/10);
        System.out.print(engNum[lastDigit] + " ");

        
    }
    public static void main(String[] args) {
        int n = 2019;
        makeString(n);
    }   
}