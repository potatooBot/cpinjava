class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;
        for (int rot = 0; rot <4 ; rot++) {
            for (int i = 0; i <n ; i++) {
                for (int j = i; j <n-i-1 ; j++) {
                   int temp=mat[i][j];
                   mat[i][j]=mat[n-j-1][i];
                   mat[n-j-1][i]=mat[n-i-1][n-j-1];
                   mat[n-i-1][n-j-1]=mat[j][n-i-1];
                   mat[j][n-i-1]=temp;
                }
            }
boolean flag=true;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                  if(mat[i][j]!=target[i][j]){
                      flag=false;
                  }
                }
            }
            if(flag==true){
                return true;
            }
        }


        return false;
    }
}