class neighborSum {
int mat[][];
    public neighborSum(int[][] grid) {
        mat=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                mat[i][j]=grid[i][j];
            }
        }
    }
    
    public int adjacentSum(int value) {
        int dir[]={-1,0,1,0};
        int dic[]={0,1,0,-1};
        int sum=0;
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==value){
                   row=i;
                   col=j;
                   break;
               }
            }
        }
        for(int i=0;i<dir.length;i++){
            int neiRow=row+dir[i];
            int neiCol=col+dic[i];
            if(neiRow>=0&&neiRow<mat.length&&neiCol>=0&&neiCol<mat[0].length){
                sum=sum+mat[neiRow][neiCol];

            }
        }

        return sum;


    }
    
    public int diagonalSum(int value) {
         int dir[]={-1,-1,1,1};
        int dic[]={-1,1,1,-1};
        int sum=0;
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==value){
                   row=i;
                   col=j;
                   break;
               }
            }
        }
        for(int i=0;i<dir.length;i++){
            int neiRow=row+dir[i];
            int neiCol=col+dic[i];
            if(neiRow>=0&&neiRow<mat.length&&neiCol>=0&&neiCol<mat[0].length){
                sum=sum+mat[neiRow][neiCol];

            }
        }

        return sum;
        
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */