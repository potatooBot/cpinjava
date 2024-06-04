class Solution {
   // boolean ans=false;
public static boolean getWord(char board[][],int i,int j,int idx,int n,String word,boolean vis[][]){
    if(idx==n){
        return true;
    }
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};

for(int k=0;k<4;k++){
   int neiRow=i+delrow[k];
   int neiCol=j+delcol[k];
   if(neiRow>=0&&neiCol>=0&&neiRow<board.length&&neiCol<board[0].length&&idx<word.length()&&board[neiRow][neiCol]==word.charAt(idx)&&vis[neiRow][neiCol]==false)
  {
//System.out.println(neiRow+" "+neiCol+" "+idx);
vis[neiRow][neiCol]=true;
if(getWord(board,neiRow,neiCol,idx+1,n,word,vis)==true) return true;
  vis[neiRow][neiCol]=false;
  } 
}

return false;
}
    public boolean exist(char[][] board, String word) {
        boolean vis[][]=new boolean [board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                   // System.out.println(i+" "+j);
                    vis[i][j]=true;
if(getWord(board,i,j,1,word.length(),word,vis)==true) return true;
vis[i][j]=false;


                }
            }
        }

        return false;
    }
}