package Matrix_prac.Rotation_of_Matrix;

public class rotate_in_ani_clockwise {
    static void rotateby90(int mat[][], int n)
    {
        // code here
        for (int i = 0; i <n/2 ; i++) {
            for (int j = i; j <n-i-1 ; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][n-i-1];
           mat[j][n-i-1]=mat[n-i-1][n-j-1];
           mat[n-i-1][n-j-1]=mat[n-j-1][i];
           mat[n-j-1][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] []
        matrix = {{1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    int n=3;
    rotateby90(matrix,n);
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
