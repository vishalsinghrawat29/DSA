public class Problem06 {
    public static void reverseArr(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        reverseArr(nums);
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

}
