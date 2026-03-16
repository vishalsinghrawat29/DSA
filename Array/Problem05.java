public class Problem05 {

    public static int[] leftRotateArr(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] res = leftRotateArr(arr, 1);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

}
