public class Problem06 {
    public static void RecursivInsertionSort(int[] arr, int i, int n) {
        if (i == n)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        RecursivInsertionSort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int arr[] = { 29, 12, 10, 37, 13 };

        RecursivInsertionSort(arr, 0, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
