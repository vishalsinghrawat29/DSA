public class BinarySearch {
    public static int search(int arr[], int s, int e, int target){
        if (s>e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, s, m-1, target);
        }
        return search(arr, m+1, e, target);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,3,5,55,66,71};
        int target = 5;
        System.out.println(search(arr, 0, arr.length-1, target));
    }
}
