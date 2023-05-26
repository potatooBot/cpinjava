class Solution {
    public void gameOfLife(int[][] board) {
        int ans[][]=new int[board.length][board[0].length];
        int dr[]={-1,-1,-1,0,1,1,1,0};
        int dc[]={-1,0,1,1,1,0,-1,-1};
        for (int row = 0; row <board.length ; row++) {

            for (int col = 0; col < board[0].length ; col++) {
                int count=0;
                for (int i= 0; i <8 ; i++) {

                    int neirow=row+dr[i];
                    int neicol=col+dc[i];
if(neirow>=0&&neirow< board.length&&neicol>=0&&neicol<board[0].length&&board[neirow][neicol]==1){
    count++;
}
                }
                if(board[row][col]==1){
                    if(count>3){
                        ans[row][col]=0;
                    }
                    if(count==2||count==3){
                        ans[row][col]=1;
                    }
                    if(count<2){
                        ans[row][col]=0;
                    }

                }
                else  if(board[row][col]==0){
                    if(count==3) {
                        ans[row][col]=1;
                    }
                }
            }
        }

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                board[i][j]= ans[i][j];
            }
        }


    }
}