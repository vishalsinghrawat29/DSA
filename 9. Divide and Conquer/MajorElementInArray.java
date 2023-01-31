public class MajorElementInArray {

    public static int countElement(int arr[], int num , int si, int ei ){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }


    public static int majorElement(int arr[], int si, int ei){
        // base case
        if (si == ei) {
            return arr[si];
        }

        int mid = si+ (ei-si)/2;
        int left = majorElement(arr, si, mid);
        int right = majorElement(arr, mid+1, ei);

        if (left == right) {
            return left;
        }

        int leftCount = countElement(arr, left, si, ei);
        int rightCount = countElement(arr, right, si, ei);

        return leftCount > rightCount ? left : right;


    }
    public static int majorityElement(int arr[]){
        return majorElement(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr1[] = {3,2,3};
        int arr2[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
    }
}
