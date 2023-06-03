package Graph.DFS.Detonating_Bomb;

public class detonanting_bomb {
    static public int maximumDetonation(int[][] bombs) {
int n= bombs.length;
int ans=0;
        for (int i = 0; i <n ; i++) {
            boolean vis[]=new boolean[n];
            vis[i]=true;
            ans=Math.max(ans,1+dfs(bombs,vis,i));
        }
        return ans;
    }
    public static int dfs(int bombs[][],boolean vis[],int node){
        int x1=bombs[node][0];
        int y1=bombs[node][1];
        int r1=bombs[node][2];
        int ret=0;
        for (int j = 0; j <bombs.length ; j++) {
            long x2=bombs[j][0];
            long y2=bombs[j][1];
            long r2=bombs[j][2];
            if(vis[j]==true) continue;
            long ditsanceBetweenNodes= (long)Math.pow(x2-x1,2)+  (long)Math.pow(y2-y1,2);
        if(ditsanceBetweenNodes<=r1*r1){
            vis[j]=true;
ret= ret+1+dfs(bombs,vis,j);
        }
        }
return ret;
    }
    public static void main(String[] args) {
        int bombs [][]= {{1,1,5},{10,10,5}};
int ans=maximumDetonation(bombs);
        System.out.println(ans);
    }
}
