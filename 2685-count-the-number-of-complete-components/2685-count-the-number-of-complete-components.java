class pair{
    int edge,vertices;
    public pair(int vertices,int edge){
        this.vertices=vertices;
        this.edge=edge;
    }
}
class Solution {
 public static pair getNoOfNodes(int node,ArrayList<ArrayList<Integer>> adjList,int parentNode,boolean vis[]){
vis[node]=true;
int vertices=1;
int edges=adjList.get(node).size();
        for (int it : adjList.get(node) ) {
            if(vis[it]==false){
                pair temp=getNoOfNodes(it,adjList,parentNode,vis);
            vertices+=temp.vertices;
            edges=edges+temp.edge;
            }
        }
        return new pair(vertices,edges);
    }


 public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length ; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
        }

        boolean vis[]=new boolean[n];
int count=0;
        for (int i = 0; i <n ; i++) {

            if(vis[i]==false){
                pair ans=getNoOfNodes(i,adjList,i,vis);
            int vertices= ans.vertices;
            int edgeNo=ans.edge;
            if((vertices*(vertices-1))==edgeNo){
                count++;
            }
            }
        }
        System.out.println(adjList);


        return count;
    }
}     