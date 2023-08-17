package Matrix_prac.Boolean_Matrix;

public class boolean_matrix {
    static  void booleanMatrix(int matrix[][])
    {

     int r= matrix.length;
     int c=matrix[0].length;
boolean row[]=new boolean[r];
boolean col[]=new boolean[c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(matrix[i][j]==1){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for (int i = 0; i <row.length ; i++) {
            if (row[i]==true)
            setRowOne(matrix,i);
        }// code here
        for (int i = 0; i <col.length ; i++) {
            if (col[i]==true)
                setColOne(matrix,i);
        }// code here
    }
    public static void setRowOne(int matrix[][],int row){
        for (int i = 0; i <matrix[0].length ; i++) {
            matrix[row][i]=1;
        }
    }
    public static void setColOne(int matrix[][],int col){
        for (int i = 0; i <matrix.length ; i++) {
            matrix[i][col]=1;
        }
    }
    public static void main(String[] args) {
        int R = 4, C = 3;
        int matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};
    booleanMatrix(matrix);
        for (int i = 0; i <R ; i++) {
            for (int j = 0; j <C ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
