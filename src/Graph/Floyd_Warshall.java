package Graph;

public class Floyd_Warshall {
    static  public void shortest_distance(int[][] matrix)
    {
        // Code here
        int n= matrix.length;;
        int m=matrix.length;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]==-1){
                    matrix[i][j]=(int)1e9;
                }
                else if(i==j) {
                    matrix[i][j]=0;
                }
            }
        }
        for (int via = 0; via <n ; via++) {
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    matrix[i][j]=Math.min(matrix[i][j],matrix[i][via] +matrix[via][j]);
                }
            }
        }



        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]==(int)(1e9)){
                    matrix[i][j]=-1;
                }
                else if(i==j) {
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{0,1,43},{1,0,6},{-1,-1,0}};
        shortest_distance(matrix);
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
