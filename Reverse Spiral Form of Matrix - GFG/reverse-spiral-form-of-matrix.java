//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] matrix)
    {
     
        int ans[]=new int[R*C];

        int dr[]={0,1,0,-1};
        int dc[]={1,0,-1,0};
boolean vis[][]=new boolean[R][C];

        ArrayList<Integer> list=new ArrayList<>() ;
int r=0,c=0,di=0;
        for (int i = 0; i <R*C ; i++) {
            list.add(matrix[r][c]);
            vis[r][c]=true;
            int cr= r+dr[di];
            int cc= c+dc[di];

            if(cr>=0&&cr<R&&cc>=0&&cc<C&&vis[cr][cc]==false){
                r=cr;
                c=cc;
            }
            else {
                di=(di+1)%4;
                r=r+dr[di];
                c=c+dc[di];
            }

        }
        Collections.reverse(list);
        for (int i = 0; i < list.size() ; i++) {
            ans[i]= list.get(i);
        }
        return ans;// code here
    }
}