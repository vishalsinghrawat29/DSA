public class Problem06 {

    public static void reverseArr(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] leftRotateArr(int[] nums, int k) {
        k = k % nums.length;

        reverseArr(nums, 0, nums.length - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, nums.length - 1);

        return nums;
    }

    public static int[] RightRotateArr(int[] nums, int k) {
        k = k % nums.length;

        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, nums.length - 1);
        reverseArr(nums, 0, nums.length - 1);

        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] res = leftRotateArr(arr, 3);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

}
