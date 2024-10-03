class Solution {

public static void backtrack(char board[][],int left[],int lowerDiag[],int upDiag[],int col,List<List<String>> ans){
if(col==board.length){
ans.add(build(board));
return;
}
for(int row=0;row<board.length;row++){
if(left[row]==0&&upDiag[row+col]==0&&lowerDiag[board.length-1 +col-row]==0){
    board[row][col]='Q';
    left[row]=1;
    upDiag[row+col]=1;
    lowerDiag[board.length-1+col-row]=1;
    backtrack(board,left,lowerDiag,upDiag,col+1,ans);
    board[row][col]='.';
    left[row]=0;
    upDiag[row+col]=0;
    lowerDiag[board.length-1+col-row]=0;
}


}


}

public static List<String> build(char board[][]){
    List<String> ans=new ArrayList<>();
    for(int i=0;i<board.length;i++)
{
String s=new String(board[i]);
ans.add(s);
}

return ans;
}


    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];

        for(char row[]:board)
        Arrays.fill(row,'.');

        List<List<String>> ans=new ArrayList<>();
        
        int left[]=new int[n];
        int upDiag[]=new int[2*n -1];
        int lowerDiag[]=new int [2*n-1];
         

         backtrack(board,left,lowerDiag,upDiag,0,ans);


return ans;



    }
}