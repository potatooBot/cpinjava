package Matrix_prac;

public class make_zeros {

    public  static void  MakeZeros(int[][] matrix)
    {
        // code here
        int dr[]={-1,0,1,0};
        int dc[]={0,-1,0,1};
        int n= matrix.length;
        int m= matrix[0].length;
     //   int fal[][]=matrix;
        int dummy[][]=new int[n][m];
        int rowcol[][]=new int[n][m];

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
dummy[i][j]=matrix[i][j];
                if(matrix[i][j]==0){
                    rowcol[i][j]=1;
                }
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {

                if(rowcol[i][j]==1){
                    setSum(matrix,dummy,i,j,dr,dc);
                }
            }
        }
    }
    public static void setSum(int matrix[][],int dum[][],int row,int col,int dr[],int dc[]){

        int sum=0;
        for (int i = 0; i <4 ; i++) {
            int delr=row+dr[i];
            int delc=col+dc[i];

            if(delr>=0&&delc>=0&&delr< matrix.length&&delc<matrix[0].length){
                sum=sum+dum[delr][delc];
                matrix[delr][delc]=0;
            }
        }
        matrix[row][col]=sum;
    }
    public static void main(String[] args) {
       int [][] matrix = {{0 ,16 ,0 ,9 ,6 ,18},
        {4 ,4 ,7 ,8 ,8 ,0},
        {11, 4, 17, 12, 0, 18},
        {    6 ,14, 12, 12, 4 ,3}};
MakeZeros(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
