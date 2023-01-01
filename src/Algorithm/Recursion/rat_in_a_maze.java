//Time Complexity: O(4^(m*n)), because on every cell we need to try 4 different directions.
//
//        Space Complexity:  O(m*n) ,Maximum Depth of the recursion tree(auxiliary space).


//Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N – 1, N – 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are ‘U'(up), ‘D'(down), ‘L’ (left), ‘R’ (right). Value 0 at a cell in the matrix represents that it is blocked and the rat cannot move to it while value 1 at a cell in the matrix represents that rat can travel through it.
//
//        Note: In a path, no cell can be visited more than one time.
//
//        Print the answer in lexicographical(sorted) order
//
//        Examples:
//
//        Example 1:
//
//        Input:
//        N = 4
//        m[][] = {{1, 0, 0, 0},
//        {1, 1, 0, 1},
//        {1, 1, 0, 0},
//        {0, 1, 1, 1}}
//
//        Output: DDRDRR DRDDRR
package Algorithm.Recursion;
import java.util.*;
public class rat_in_a_maze {
    public static void solve(int m[][],int n,int i,int j,ArrayList < String > ans,int di[],int dj[],String move,int vis[][]){
        if(i==n-1&&j==n-1) {
            ans.add(move);
            return;
        }

        String str="DLRU";
        for(int ind=0;ind<str.length();ind++){
            int iidx=i+di[ind];
            int jidx=j+dj[ind];
            if(iidx>=0&&jidx>=0&&iidx<n&&jidx<n&&vis[iidx][jidx]==0&&m[iidx][jidx]==1){
                vis[i][j]=1;

                solve(m,n,iidx,jidx,ans,di,dj,move+str.charAt(ind),vis);
                vis[i][j]=0;
            }
        }

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        String move="";
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        int vis[][]=new int[n][n];

        ArrayList < String > ans = new ArrayList < > ();
        if(m[0][0]==1) solve(m,n,0,0,ans,di,dj,"",vis);


        return ans;


    }

    public static void main(String[] args) {
        int [][] m= {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        ArrayList <String> list=new ArrayList<>();
        list=findPath(m,m.length);
        System.out.println(list);
    }
}
