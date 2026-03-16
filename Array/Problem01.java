
public class Problem01 {
    public static int findLargestInArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int res = findLargestInArr(arr);
        System.out.println(res);
    }
}
