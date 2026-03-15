
import java.util.HashMap;
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of Arr: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }

            for (int key : map.keySet()) {
                System.out.println(key + " -> " + map.get(key));
            }

        }
    }

}
