class Solution {
    public static boolean valid(int mat[][],int row,int col,int val){
for(int i=0;i<mat.length;i++){

if(mat[i][col]==val){
    return false;
}
if(mat[row][i]==val){
    return false;
}

}
return true;
    }
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
int val=matrix[i][j];
matrix[i][j]=0;
            if(!valid(matrix,i,j,val)){
                return false;
            }
            else {
                matrix[i][j]=val;
            }
        }
        }
        return true;
    }
}