package Matrix_prac;

public class matriz_zeroes {
    public static void  MakeZeros(int[][] matrix)
    {
        // code here
        for (int i = 0; i <=matrix.length ; i++) {
            for (int j = 0; j <=matrix[0].length ; j++) {
                if(matrix[i][j]==0){
                    int sum=matrix[i-1][j]+matrix[i+1][j]+ matrix[i][j-1] +matrix[i][j+1];
                    matrix[i][j]=sum;
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 10, 0},
                {8, 9, 4, 6},
                {8, 4, 5, 2}
        };
        MakeZeros(matrix);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
