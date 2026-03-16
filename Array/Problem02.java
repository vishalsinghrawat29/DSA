public class Problem02 {
    public static int findSecLargestInArr(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int res = findSecLargestInArr(arr);
        System.out.println(res);
    }

}
