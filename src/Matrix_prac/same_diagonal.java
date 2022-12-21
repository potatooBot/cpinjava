package Matrix_prac;
//Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.
//
//        A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.


//Hint-Check whether each value is equal to the value of it's top-left neighbor.


public class same_diagonal {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        boolean check=true;
        for (int i = matrix.length-1; i >0 ; i--) {
            for (int j = matrix[0].length-1; j >0 ; j--) {
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {

//        int mat[][]= {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int mat[][]={{1,2},{2,2}};
    boolean check=isToeplitzMatrix(mat);
        System.out.println(check);
    }
}
