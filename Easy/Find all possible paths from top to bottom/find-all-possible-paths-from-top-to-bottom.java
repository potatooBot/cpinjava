//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[][] grid = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.findAllPossiblePaths(a[0],a[1], grid);
            
            IntMatrix.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
        public static void getWays(int row,int col,int dp[][],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> ds,int grid[][]){
        if(row>=grid.length||col>=grid[0].length) return;
        ds.add(grid[row][col]);
        if(row== grid.length-1&&col==grid[0].length-1) {
            ans.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
            return;
        }

        getWays(row,col+1,dp,ans,ds,grid);
        getWays(row+1,col,dp,ans,ds,grid);
    ds.remove(ds.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        int dp[][]=new int[n][m];
        getWays(0,0,dp,ans,ds,grid);
        Collections.reverse(ans);
        return ans;
    }
}
        
