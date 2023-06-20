//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
     public boolean dfs(char[][] board, String str, int[][] vis, int x, int y, int index){
        if(index == str.length()) return true;
        if(x >= board.length || y >= board[0].length || x < 0 || y < 0 || vis[x][y] == 1 || board[x][y] != str.charAt(index)){
            return false;
        }
        
        vis[x][y] = 1;
        
        boolean isTrue = dfs(board, str, vis, x+1, y, index+1) ||
                        dfs(board, str, vis, x-1, y, index+1) ||
                        dfs(board, str, vis, x, y+1, index+1) ||
                        dfs(board, str, vis, x, y-1, index+1) ||
                        dfs(board, str, vis, x+1, y+1, index+1) ||
                        dfs(board, str, vis, x-1, y-1, index+1) ||
                        dfs(board, str, vis, x+1, y-1, index+1) || 
                        dfs(board, str, vis, x-1, y+1, index+1);
        
        
        vis[x][y] = 0;
        return isTrue;
    
    }
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        int rows = board.length;
        int cols = board[0].length;
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[rows][cols];
        
        for(String str : dictionary){
            boolean isFound = false;
            for(int i = 0; i < rows && isFound == false; i++){
                for(int j = 0; j < cols; j++){
                    if(vis[i][j] == 0 && board[i][j] == str.charAt(0)){
                        if(dfs(board, str, vis, i, j, 0)){
                            ans.add(str);
                            isFound = true;
                            break;
                        }
                            
                    }
                }
                // break;
            }
        }
        
        Collections.sort(ans);
        String[] finali = new String[ans.size()];
        for(int i = 0; i < finali.length; i++){
            finali[i] = ans.get(i);
        }
        return finali;
        
    }
}