import java.util.Scanner;

public class TwoDArray {

public static void search(int matrix[][], int key){
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == key) {
               System.out.println("Found at cell (" + i +"," + j + ")");
               return;
            }
         }
       }
       System.out.println("Key not found");
       return;
}
 public static void main(String[] args) {
   Scanner sc = new Scanner((System.in));
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
         matrix[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
         System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
    search(matrix, 5);
    sc.close();

 }   
}