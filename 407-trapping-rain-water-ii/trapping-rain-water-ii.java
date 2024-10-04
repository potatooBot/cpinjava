
class cell{
    int row;
    int col;
    int minHeight;
    public cell(int _row,int _col,int _minHeight){
        this.row=_row;
        this.col=_col;
        this.minHeight=_minHeight;
    }
}
class Solution {
    public int trapRainWater(int[][] mat) {
        PriorityQueue<cell> pq=new PriorityQueue<>(Comparator.comparingInt(c->c.minHeight));
int n=mat.length;
int m=mat[0].length;
boolean vis[][]=new boolean[n][m];
        for(int row=0;row<n;row++){
            if(row==0||row==n-1){

                for(int col=0;col<m;col++){
                pq.add(new cell(row,col,mat[row][col]));
                vis[row][col]=true;
            }
            }
            else{
                vis[row][0]=true;
                vis[row][m-1]=true;
                pq.add(new cell(row,0,mat[row][0]));
                pq.add(new cell(row,m-1,mat[row][m-1]));
            }
        }
int dr[]={-1,0,1,0};
int dc[]={0,1,0,-1};


    int vol=0;
while(!pq.isEmpty()){
int cellHeight=pq.peek().minHeight;
int row= pq.peek().row;
int col=pq.peek().col;
pq.remove();

for(int i=0;i<4;i++){
int neiRow= row+dr[i];
int neiCol=col+dc[i];
if(neiRow>=0&&neiRow<n&&neiCol>=0&&neiCol<m&&vis[neiRow][neiCol]==false){


    vis[neiRow][neiCol]=true;

    if(cellHeight>mat[neiRow][neiCol]){
        vol=vol+(cellHeight-mat[neiRow][neiCol]);
    }

    pq.add(new cell(neiRow,neiCol,Math.max(mat[neiRow][neiCol],cellHeight)));
}


}



    
}

return vol;
    }
}