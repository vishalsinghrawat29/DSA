public class BinarySearchAnalysis {
    // Time Complexity - O(logn);
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid =  (end+start)/2;

            // case 1:
            if (arr[mid] ==  key) {
                return mid;                
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
