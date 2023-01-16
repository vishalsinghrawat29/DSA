public class TargetValueArray {

    public static int Search(int numbers[], int target){
        int min = minSearch(numbers);
        if (numbers[min] <= target && target <= numbers[numbers.length -1]) {
            return search(numbers,min,numbers.length-1,target);
        } else {
            return search(numbers,0,min,target);
        }
        
    }

    //binary search to find target in left to right boundary 
    public static int search(int numbers[], int left, int right, int target){
        int l = left;
        int r = right;
        while(l<=r){
            int mid = l + (r - l)/2;
            if (numbers[mid] == target) {
                return mid;
            } else if(numbers[mid] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }

    //smallest element index
    public static int minSearch(int numbers[]){
        int left =0;
        int right = numbers.length - 1;
        while(left<right){
            int mid = left + (right -left)/2;  
            if (mid>0 && numbers[mid-1]> numbers[mid]) {
                return mid;
            } else if(numbers[left] <= numbers[mid] && numbers[mid] > numbers[right]) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
            int num1[] = {2,5,6,7,0,1,2};
            int num2[] = {1};
            int target1 = 0;
            int target2 = 3;
            int target3 = 0;
            System.out.println(Search(num1, target1));
            System.out.println(Search(num1, target2));
            System.out.println(Search(num2, target3));
    }

}



// ------------------Time Complexity = O(n)-----------------------
    // public static int getTargetValueIndex(int numbers[], int target){

    //     for (int i = 0; i < numbers.length; i++) {
    //         if(numbers[i] == target){
    //             return i;
    //         }
    //     }

    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int num1[] = {2,5,6,7,0,1,2};
    //     int num2[] = {1};
    //     int target1 = 0;
    //     int target2 = 3;
    //     int target3 = 0;
    //     System.out.println(getTargetValueIndex(num1, target1));
    //     System.out.println(getTargetValueIndex(num1, target2));
    //     System.out.println(getTargetValueIndex(num2, target3));
    // }