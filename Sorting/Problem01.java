
public class Problem01 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
                j++;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 29, 12, 10, 37, 13 };
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
