public class Problem10 {
    public static int missingNumber(int[] arr) {
        int sum = 0;
        int n = arr.length + 1;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        long expecSum = n * (n + 1) / 2;
        return (int) expecSum - sum;

    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        System.out.println(missingNumber(arr));
    }
}