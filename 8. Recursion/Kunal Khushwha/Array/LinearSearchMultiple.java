import java.util.ArrayList;
public class LinearSearchMultiple {
    public static ArrayList<Integer> findAllIndex(int arr[], int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
            
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,4,2,1,9,2};
        System.out.println(findAllIndex(arr, 2, 0));
    }
}
