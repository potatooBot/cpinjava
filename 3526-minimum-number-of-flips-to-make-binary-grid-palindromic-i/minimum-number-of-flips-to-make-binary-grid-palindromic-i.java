class Solution {
    public int minFlips(int[][] grid) {
        int rowFlip=0;
        int colFlip=0;
int n=grid.length;
int m=grid[0].length;
for(int row=0;row<n;row++){
    int i=0;
    int j=m-1;
    while(i<=j){
if(grid[row][i]!=grid[row][j]){
    rowFlip++;
}
i++;
j--;
    }
}

for(int col=0;col<m;col++){
    int i=0;
    int j=n-1;
    while(i<=j){
if(grid[i][col]!=grid[j][col]){
    colFlip++;
}
i++;
j--;
    }
}

return Math.min(rowFlip,colFlip);
    }
}