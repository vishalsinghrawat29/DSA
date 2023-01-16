public class RepeatArray {
    public static boolean repeatValueArray(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,1};
        int nums2[] = {1,2,3,4};
        int nums3[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(repeatValueArray(nums1));
        System.out.println(repeatValueArray(nums2));
        System.out.println(repeatValueArray(nums3));
    }
}
