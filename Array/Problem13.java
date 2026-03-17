public class Problem13 {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += arr[right];
            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int res = longestSubarray(arr, k);
        System.out.println(res);
    }

}
