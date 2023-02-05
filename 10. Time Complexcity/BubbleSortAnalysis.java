public class BubbleSortAnalysis {

    // Time Complexity
    // wrost case - O(n^2)
    // best case - O(n^2)
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++){
            for (int j = 0; j < arr.length - turn - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    // Optimized Bubble Sort
    // Time Complexity
    // wrost case - O(n^2)
    // best case - O(n)
    public static void optimizedBubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++){
            boolean swapped = false;
            for (int j = 0; j < arr.length - turn - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if (swapped ==  false) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        

    }
}
