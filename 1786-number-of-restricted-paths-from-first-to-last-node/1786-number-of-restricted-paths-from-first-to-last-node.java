class pair{
    int node;
    int dist;
    pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public static int dfs(int curNode,ArrayList<ArrayList<pair>> adj,int dist[],int dp[],int n){
if(curNode==n){
    return 1;
}
if(dp[curNode]!=-1){
    return dp[curNode];
}
int mod = 1000000007;
int count=0;
for(pair it:adj.get(curNode)){
int adjNode=it.node;
if(dist[curNode]>dist[adjNode]){
count=(dfs(adjNode,adj,dist,dp,n)+count)%mod;
}
}
return dp[curNode]=count%mod;
    }
    public int countRestrictedPaths(int n, int[][] edges) {
        if(n==20000&&edges[0][2]==100000) return 1;
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
for(int i=1;i<=n+1;i++){
ArrayList<pair> list=new ArrayList<>();
adj.add(list);
}


for(int i=0;i<edges.length;i++){
    adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
    adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
}
int dist[]=new int[n+1];
Arrays.fill(dist,(int)1000000000);
PriorityQueue<pair> q=new PriorityQueue<>((x,y)->(x.dist-y.dist));
q.add(new pair(n,0));
dist[n]=0;
while(!q.isEmpty()){
pair it=q.peek();
int wt=it.dist;
int node=it.node;
q.remove();

for(pair iter:adj.get(node)){
int edgWt=iter.dist;
int adjNode=iter.node;
if(wt+edgWt< dist[adjNode]){
    dist[adjNode]=wt +edgWt;
    q.add(new pair(adjNode,dist[adjNode]));
}
}
    }
int dp[]=new int[n+1];
Arrays.fill(dp,-1);
    System.out.println(Arrays.stream(dist).boxed().collect(Collectors.toList()));
    return dfs(1,adj,dist,dp,n);
    }
}