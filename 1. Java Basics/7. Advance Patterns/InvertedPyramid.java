public class InvertedPyramid {

    public static void invRotatedPyramind(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1 ; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        invRotatedPyramind(5);
    }
}
