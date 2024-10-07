class Solution {
    public void bfs(int n,int src,ArrayList<ArrayList<Integer>> adjList,boolean vis[],boolean sus[]){


        Queue<Integer> q=new LinkedList<>();

        q.add(src);
vis[src]=true;
        while(!q.isEmpty()){
            int node=q.peek();
            q.remove();
vis[node]=true;
sus[node]=true;
            for(int adjNode:adjList.get(node)){
if(vis[adjNode]==false){
    q.add(adjNode);
}
            }
        }
    }
    public boolean [] checkValid(boolean sus[],ArrayList<ArrayList<Integer>> adjList,int n){
         System.out.println(adjList);
         int i=0;
for(ArrayList<Integer> ele:adjList){
    
   for(int node:ele){
    if(sus[i]==false&&sus[node]==true){
        System.out.println();
        boolean ans[]=new boolean [n];
        return ans;
    }
   }
    i++;
}
return sus;
    }
    public List<Integer> remainingMethods(int n, int k, int[][] edge) {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<n;i++)
adjList.add(new ArrayList<>());


for(int ele[]:edge){
    adjList.get(ele[0]).add(ele[1]);
}

boolean vis[]=new boolean [n];
boolean sus[]=new boolean [n];
bfs(n,k,adjList,vis,sus);
sus=checkValid(sus,adjList,n);
    List<Integer> ans=new ArrayList<>();


System.out.println(Arrays.toString(sus));

for(int i=0;i<n;i++)
{
    if(vis[i]==false){
        for(int adjNode:adjList.get(i)){
            vis[adjNode]=false;
        }
    }
}


for(int i=0;i<n;i++){
    if(sus[i]==false)
ans.add(i);
}
    return ans;
    }



}