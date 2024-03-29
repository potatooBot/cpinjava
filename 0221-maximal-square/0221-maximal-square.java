class Solution {
    public int maximalSquare(char[][] matrix) {
 int n=matrix.length;
 int m=matrix[0].length;
 int mat[][]=new int[n][m];
/* for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
  if(matrix[i][j]=='0'){
      mat[i][j]=0;
  }
  else{
      mat[i][j]=1;
  }
        }
 }
  /*for(int rows[]:mat){
        System.out.print(Arrays.toString(rows));
        System.out.println();
    }*/
         int dp[][]=new int[n][m];
        
        for(int j=0;j<m;j++){
  if(matrix[0][j]=='1')          
            dp[0][j]=1;
        }
        
        
        for(int i=0;i<n;i++){
           if(matrix[i][0]=='1')
            dp[i][0]=1;
        }
        
        
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
     if(matrix[i][j]=='0'){
         dp[i][j]=0;
     }       
     else{
         dp[i][j]=1+ Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
     }
        }
    }
    
    int maxi=-1;
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
    maxi=Math.max(maxi,dp[i][j]);
        }
    }
    
    return maxi*maxi;
    }
}