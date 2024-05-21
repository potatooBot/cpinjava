class Solution {
    public static void getSub(int grid[][],int row,int col,boolean vis[][],int maxi[],int sum){
        int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
vis[row][col]=true;
sum=sum+grid[row][col];
maxi[0]=Math.max(maxi[0],sum);
//System.out.println(sum);
for(int i=0;i<4;i++){
    int neirow= row+delrow[i];
    int neicol=col +delcol[i];
 if(neirow>=0&&neirow<grid.length&&neicol>=0&&neicol<grid[0].length&&vis[neirow][neicol]==false&&grid[neirow][neicol]!=0){
    getSub(grid,neirow,neicol,vis,maxi,sum);
 }

}

sum=sum-grid[row][col];
vis[row][col]=false;


    }
    public int getMaximumGold(int[][] grid) {
      int n=grid.length;
      int m=grid[0].length;
                int maxi[]=new int[1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
             boolean vis[][]=new boolean[n][m];
                if(grid[i][j]!=0){
getSub(grid,i,j,vis,maxi,0);
                }
            }
        }

        return maxi[0];
    }
}