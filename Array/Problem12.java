public class Problem12 {
    public static int getSingleElement(int[] arr) {
        int xor = 0;
        for (int n : arr) {
            xor = xor ^ n;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };
        int res = getSingleElement(arr);
        System.out.println(res);
    }

}
