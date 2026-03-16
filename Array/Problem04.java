public class Problem04 {
    public static int RemoveDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];

            }
        }

        return i + 1;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int res = RemoveDuplicates(arr);
        System.out.println(res);
    }
}
