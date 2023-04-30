class tuple{
    int distance,row,col;
    public tuple(int distance,int row,int col){
        this.distance=distance;
        this.col=col;
        this.row=row;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
            PriorityQueue<tuple> pq=new PriorityQueue<tuple>((x,y)->x.distance-y.distance);
        pq.add(new tuple(0,0,0));
        int dist[][]=new int[heights.length][heights[0].length];
        for (int i = 0; i < heights.length ; i++) {
            for (int j = 0; j <heights[0].length ; j++) {
                dist[i][j]=(int)1e9;
            }
        }
        dist[0][0]=0;
         int dr[]={-1,0,1,0};
            int dc[]={0,1,0,-1};
        while (pq.isEmpty()==false)
        {
           
        tuple it= pq.peek();
        pq.remove();
            int row=it.row;
            int col=it.col;
            int diff=it.distance;
            if(row== heights.length-1&&col==heights[0].length-1) return  diff;
            for (int i = 0; i <4 ; i++) {
                int newR=row +dr[i];
                int newC=col +dc[i];
                if(newR>=0&&newR< heights.length&&newC>=0&&newC<heights[0].length){
                    int newEfforts=Math.max(Math.abs(heights[row][col]-heights[newR][newC]),diff);
                    if(newEfforts<dist[newR][newC]){
                        dist[newR][newC]=newEfforts;
                        pq.add(new tuple(newEfforts,newR,newC));
                    }
                }
            }
        }

        return 0;
    }
}