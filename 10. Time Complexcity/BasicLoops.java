public class BasicLoops{
    public static void main(String[] args) {
        
        //SIMPLE LOOP
        // Time Complexcity - O(n)
        int n =5;
        for (int i = 0; i < n; i++) {
            // some work is done in the loop
        }

        // NESTED LOOP - 1
        // Time Complexcity - O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // some work is done in the loop
            }
        }

        // NESTED LOOP - 2
        // Time Complexcity - O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // some work is done in the loop
            }
        }
        
        // NESTED LOOP - 3
        // Time Complexcity - O(n)
        int k = 5;
        for (int i = 0; i < n; i+=k) {
            for (int j = i+1; j < k; j++) {
                // some work is done in the loop
            }
        }
        
    }
}