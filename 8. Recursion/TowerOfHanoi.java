public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String des){
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + des);
            return;
        }

        // transfer top n-1 disk from src to helper using des as "helper"
        towerOfHanoi(n-1, src, des, helper);
        // transfer nth from src to des
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        // transfer top n-1 disk from helper to des using src as "helper"
        towerOfHanoi(n-1, helper, src, des);

    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "A", "B", "C");
    }
}
