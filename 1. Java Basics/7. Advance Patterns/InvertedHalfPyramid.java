public class InvertedHalfPyramid {
    public static void invertedHalfPyramidNumber(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        invertedHalfPyramidNumber(5);
    }
}
