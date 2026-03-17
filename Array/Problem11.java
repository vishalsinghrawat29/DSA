public class Problem11 {
    public static int consecutiveOne(int[] arr) {
        int max = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        int res = consecutiveOne(arr);
        System.out.println(res);
    }
}
