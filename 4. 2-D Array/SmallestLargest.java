public class SmallestLargest {
    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] < smallest) {
                  smallest = matrix[i][j];
               }
            }
          }
          System.out.println("Smallest Element: " + smallest);
    }

    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] > largest) {
                  largest = matrix[i][j];
               }
            }
          }
          System.out.println("Largest Element: " + largest);
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        smallest(matrix);
        largest(matrix);

    }
}
