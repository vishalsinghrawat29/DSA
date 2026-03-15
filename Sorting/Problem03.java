public class Problem03 {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 29, 12, 10, 37, 13 };

        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}