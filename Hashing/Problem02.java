
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02 {

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
            int maxFreq = 0;
            int minFreq = Integer.MAX_VALUE;
            int maxElement = 0;
            int minElement = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int element = entry.getKey();
                int frequency = entry.getValue();

                if (frequency > maxFreq) {
                    maxFreq = frequency;
                    maxElement = element;
                }
                if (frequency < minFreq) {
                    minFreq = frequency;
                    minElement = element;
                }
            }

            System.out.println("Highest frequency element: " + maxElement);
            System.out.println("Lowest frequency element: " + minElement);
        }
    }

}
