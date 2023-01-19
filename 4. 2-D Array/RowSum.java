public class RowSum {
    public static int  getCountOfElement(int matrix[][] , int rowNumber){
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum+=matrix[rowNumber-1][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = { 
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        System.out.println(getCountOfElement(matrix, 2));
    }
}
