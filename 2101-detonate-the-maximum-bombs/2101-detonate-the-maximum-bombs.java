class Solution {
    public int maximumDetonation(int[][] bombs) {
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
        long x1=bombs[node][0];
        long y1=bombs[node][1];
        long r1=bombs[node][2];
        int ret=0;
        for (int j = 0; j <bombs.length ; j++) {
            if(vis[j]) continue;
            long x2=bombs[j][0];
            long y2=bombs[j][1];
            long r2=bombs[j][2];
            
 long ditsanceBetweenNodes= (long)Math.pow((x2-x1),2)+  (long)Math.pow((y2-y1),2);
        if(ditsanceBetweenNodes<=r1*r1){
            vis[j]=true;
ret+=1+dfs(bombs,vis,j);
        }
        }
return ret;
    }
}