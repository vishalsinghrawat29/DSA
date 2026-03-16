import java.util.ArrayList;

public class Problem09 {

    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2, int n1, int n2) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {

                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;

            } else if (arr1[i] > arr2[j]) {

                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;

            } else {

                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }

        return list;
    }

    public static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n1, int n2) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                i++;

            } else if (arr1[i] > arr2[j]) {
                j++;

            } else {

                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> UnionList = findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println(UnionList);

        ArrayList<Integer> IntersectionList = findIntersection(arr1, arr2, arr1.length, arr2.length);
        System.out.println(IntersectionList);
    }
}