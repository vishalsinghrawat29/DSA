public class RecusrsiveAnalysis {
    // Time Compelxity - O(N)
    // Space Complexity - O(N)
    public static int fact(int n) {
        if (n<=1) {
            return 1;
        }
        return n* fact(n-1);

    }

    // Time Compelxity - O(N)
    // Space Complexity - O(N)
    public static int sum(int n) {
        if (n<=1) {
            return 1;
        }
        return n+sum(n-1);

    }


    // Time Compelxity - O(2^N)
    // Space Complexity - O(N)
    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }


    // ------MERGE SORT------------


    // Time Compelxity - O(N)
    // Space Complexity - O(N)
    public static void merge(int arr[], int si, int mid ,int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; // interator for left part
        int j = mid+1; // interator for right part
        int k =0; // iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original array
        for (k = 0, i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }

    
    // Time Compelxity - O(NlogN)
    // Space Complexity - O(N)
    public static void mergeSort(int arr[], int si,int ei) {
        if (si>=ei) {
            return;
        }

        // kaam
        int mid = si + (ei-si)/2; // (si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }

    // Power function - 1
    // Time Compelxity - O(N)
    public static int power1(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x*power1(x, n-1);
    }


    // Power function - 2
    // Time Compelxity - O(N)
    public static int power2(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPowerSq = power2(x, n/2)*power2(x, n/2);
        if (n%2 != 0) {
            return x*halfPowerSq;
        }
        return halfPowerSq;
    }

    // Power function - 3
    // Time Compelxity - O(logN)
    public static int power3(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = power3(x, n/2);
        int halfPowerSq = halfPower*halfPower;
        if (n%2 != 0) {
            return x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        
    }
}
