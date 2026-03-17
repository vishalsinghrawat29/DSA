
import java.util.HashMap;
import java.util.Map;

public class Problem14 {
    public static int longestSubarray(int[] arr) {
        // map prefix sum -> first index seen
        Map<Integer, Integer> mpp = new HashMap<>();
        // best length so far
        int maxi = 0;
        // running prefix sum
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.containsKey(sum)) {
                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }

        return maxi;

    }

    public static void main(String[] args) {
        int[] arr = { 9, -3, 3, -1, 6, -5 };
        int res = longestSubarray(arr);
        System.out.println(res);
    }

}
