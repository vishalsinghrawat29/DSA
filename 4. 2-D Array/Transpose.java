public class Transpose {

    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
          }
    }
    public static void getTranspose(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int transposeMatrix[][] = new int[m][n];
        // transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        printMatrix(transposeMatrix);
    }
    public static void main(String[] args) {
        int matrix[][] = { 
            {1,2,3},
            {4,5,6}
        };
        getTranspose(matrix);
    }
}
