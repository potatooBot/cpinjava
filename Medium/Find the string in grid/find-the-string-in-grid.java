//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static boolean getWord(char board[][],int i,int j,int idx,int n,String word,int dir){
    if(idx==n){
        return true;
    }
int delrow[]={0,1,1,1,0,-1,-1,-1};
int delcol[]={1,1,0,-1,-1,-1,0,1};
   int neiRow=i+delrow[dir];
   int neiCol=j+delcol[dir];
   if(neiRow>=0&&neiCol>=0&&neiRow<board.length&&
   neiCol<board[0].length&&idx<word.length()&&board[neiRow][neiCol]==word.charAt(idx)
 )
  {
if(getWord(board,neiRow,neiCol,idx+1,n,word,dir)==true) return true;
  } 
return false;
}
   
    public int[][] searchWord(char[][] board, String word)
    {
        int delrow[]={0,1,1,1,0,-1,-1,-1};
int delcol[]={1,1,0,-1,-1,-1,0,1};
        ArrayList<ArrayList<Integer>> ds=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
          for(int k=0;k<8;k++){
                if(board[i][j]==word.charAt(0)){
                //    System.out.println(i+"-"+j);
                   
if(getWord(board,i,j,1,word.length(),word,k)==true) {
    ArrayList<Integer> list=new ArrayList<>();
    list.add(i);
    list.add(j);
    if(ds.contains(list)==false)
    ds.add(new ArrayList<>(list));
    break;
}
//vis[i][j]=false;
                }
            }
            }
        }
        

        
      //  System.out.println(ds);
int ans[][]=new int[ds.size()][2];
for(int i=0;i<ds.size();i++){
    ans[i][0]=ds.get(i).get(0);
    ans[i][1]=ds.get(i).get(1);
}


        return ans;
    }
}