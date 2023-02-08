public class Assignment {

    // Question-1
    // Time Complexity - O(NlogN)
    public static void question1() {
        int n =10;
        int i,j,k = 0;
        for (i = n/2; i <= n; i++) {
            for (j = 2; j <= n; j=j*2) {
                k = k+n/2;
            }   
        }
    }


    // Question-2
    // Time Complexity - O(logKN) - log n of base k
    public static void question2() {
        int k= 2,n =10;
        for (int i = 0; i < n; i++) {
            i*=k;  
        }
    }

    // Question-3
    // Time Complexity - O(sqrt(n)) 
    // Space Complexity - O(1) 
    public static int question3(int x) {
        if (x==0 || x==1) {
            return x;
        }
        int i = 1, result =1;
        while (result<x) {
            i++;
            result = i*i;
        }
        return i-1;
    }


    // Question-4
    // Time Complexity - O(n^2)
    // Space Complexity - O(1) 
    public static void question4() {
        int a= 0;
        int n =10;
        for (int i = 0; i < n; ++i) {
            for (int j = n; j > i; --j) {
                a = a+i+j;
            }  
        }
    }

    public static void main(String[] args) {
        
    }
}
