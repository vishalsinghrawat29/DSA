public class InvertedCount {
    public static int merge(int arr[], int si, int mid, int ei){
        int i  = si, j =mid, k =0;
        int invCount = 0;
        int temp[] = new int[(ei - si + 1)];

        while ((i<mid) &&(j<=ei)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            }else{
                temp[k] = arr[j];
                invCount += (mid-i);
                k++;
                j++;
            }
        }

        while (i<mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j<=ei) {
            temp[k] = arr[j];
            invCount += (mid-i);
            k++;
            j++;
        }

        for (i = si, k =0; i <= ei; i++, k++) {
            arr[i] = temp[k];

        }
        return invCount;
    }
    public static int mergeSort(int arr[], int si , int ei){
        int invCount = 0;

        if (ei>si) {
            int mid = (si+ei)/2;

            invCount = mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid+1, ei);
            invCount += merge(arr, si, mid+1, ei);
        }
        return invCount;
    }
    public static int getInversion(int arr[]){
        return mergeSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,20,6,4,5};

        int arr2[] = {2,4,1,3,5};
        System.out.println("Inversion Count: " +getInversion(arr));
        System.out.println("Inversion Count: " +getInversion(arr2));
    }
}
