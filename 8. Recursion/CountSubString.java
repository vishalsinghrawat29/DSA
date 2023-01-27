public class CountSubString {
    public static int countSubString(String str, int start, int end, int n){
        if (n == 1) {
            return 1;
        }
        if (n<=0) {
            return 0;
        }
        // kaam
        int count = countSubString(str, start+1, end, n-1) + countSubString(str, start, end-1, n-1) - countSubString(str, start+1, end-1, n-2);

        if(str.charAt(start) == str.charAt(end)){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubString(str, 0, n-1, n));
    }
}
