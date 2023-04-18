package Graph.Kahn_Algorithm;

import Buffer.ARRAYBREAK;

import java.util.*;

public class largest_color_in_directed_graph {
    public static void topoSortDfs(ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk,boolean vis[],int n,int node,  ArrayList<ArrayList<Integer>> path,ArrayList<Integer> ds){
        vis[node]=true;
ds.add(node);
        if(adj.get(node).size()==0){


//            Collections.reverse(ds);
            path.add(new ArrayList<>(ds));
          ds.remove(ds.size()-1);
        }
        for (Integer it:
             adj.get(node)) {

            if(vis[it]==false){
                topoSortDfs(adj,stk,vis,n,it,path,ds);
            }
        }
        stk.add(node);
    }

    static    public int largestPathValue(String colors, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
int n=colors.length();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i <edges.length ; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
//        int indegree[]=new int[n];
//        for (int i = 0; i <n ; i++) {
//            for (Integer it:
//                 adj.get(i)) {
//                indegree[it]++;
//            }
//        }
//        System.out.println(adj);
//        Queue<Integer> q=new LinkedList<>();
//        for (int i = 0; i <indegree.length ; i++) {
//            if (indegree[i] == 0) {
//                q.add(i);
//            }
//        }
        int cnt=0;
        boolean vis[]=new boolean[n];
        ArrayList<ArrayList<Integer>> path=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
Stack<Integer> stk=new Stack<>();
        for (int i = 0; i <n ; i++) {
            if (vis[i] == false) {

                topoSortDfs(adj,stk,vis,n,i,path,ds);
            }
        }
if(stk.size()!=n) return -1;
        System.out.println(path);
HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <path.size() ; i++) {
            for (int j = 0; j <path.get(i).size() ; j++) {

            }
        }
//        while (!q.isEmpty())
//        {
//            int node=q.poll();
//            cnt++;
//            for (Integer it:
//                adj.get(node) ) {
//                indegree[it]--;
//                if(indegree[it]==0) q.add(it);
//            }
//            topo.add(node);
//        }
//        if(cnt!=n) return -1;
//

        return 0;

    }

    public static void main(String[] args) {
        String colors = "abaca";
        int [][]edges = {{0,1},{0,2},{2,3},{3,4}};
        largestPathValue(colors,edges);
    }
}
