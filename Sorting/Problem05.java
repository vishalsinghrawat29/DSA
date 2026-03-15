public class Problem05 {
    public static void RecursivBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        boolean didSwap = false;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = true;
            }
        }
        if (!didSwap)
            return;
        RecursivBubbleSort(arr, n - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 29, 12, 10, 37, 13 };

        RecursivBubbleSort(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
