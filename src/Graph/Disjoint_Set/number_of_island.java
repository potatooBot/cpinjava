package Graph.Disjoint_Set;
import java.util.*;
public class number_of_island {
    static  public List<Integer> numOfIslands(int n, int m,  int[][] operators) {
        //Your code here
DisjointSet ds=new DisjointSet(n*m);
List<Integer> ans=new ArrayList<>();
boolean vis[][]=new boolean[n][m];
int count=0;
for (int i = 0; i < operators.length ; i++) {

            int row=operators[i][0];
            int col=operators[i][1];

            if (vis[row][col]==true){
              ans.add(count);
                continue;
            }
            vis[row][col]=true;
            count++;
int delrow[]={-1,0,1,0};
int delcol[]={0,1,0,-1};

    for (int j = 0; j <4 ; j++) {
        int adjRow=row+delrow[j];
        int adjCol=col+delcol[j];
    if(adjRow>=0&&adjRow<n&&adjCol>=0&&adjCol<m){
        if(vis[adjRow][adjCol]==true){
            int nodeNo=row*m+ col;
            int adjNodeNo=adjRow*m+adjCol;

            if(ds.findUlp(nodeNo)!=ds.findUlp(adjNodeNo)){
                count--;
                ds.unionBysize(nodeNo,adjNodeNo);
            }
        }


    }


    }
ans.add(count);
        }

return ans;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int k = 4;
        int [][]A = {{1,1},{0,1},{3,3},{3,4}};
    List<Integer> ans=numOfIslands(n,m,A);
        System.out.println(ans);
    }
}
