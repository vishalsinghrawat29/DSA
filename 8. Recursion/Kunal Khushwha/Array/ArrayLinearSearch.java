public class ArrayLinearSearch {
    public static boolean find1(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find1(arr, target, index+1);
    }

    public static int find2(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return find2(arr, target, index+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(find1(arr, 4, 0));
        System.out.println(find2(arr, 4, 0));
    }
}
