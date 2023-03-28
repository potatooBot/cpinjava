package Graph.DFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class longest_cycle_in_graph {
    public static void dfs(int node,ArrayList<ArrayList<Integer>> adj,
                           ArrayList<ArrayList<Integer>>wrap,ArrayList<Integer> ds,boolean vis[],boolean pathVis[],int start){
        vis[node]=true;
        pathVis[node]=true;
        ds.add(node);
        for (Integer it:
             adj.get(node)) {
            if(it!=-1&&vis[it]==false){
                dfs(it,adj,wrap,ds,vis,pathVis,start);
            }
            else if(it!=-1&&pathVis[it]==true){
ds.add(it);
                wrap.add(new ArrayList<>(ds));
                return;
            }
        }

        ds.remove(ds.size()-1);
        pathVis[node]=false;
        return;
    }
    static   public int longestCycle(int[] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=edges.length;
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <n ; i++) {
            adj.get(i).add(edges[i]);
        }
        ArrayList<ArrayList<Integer>> wrap=new ArrayList<>();

       // boolean vis[]=new boolean[n];
        boolean pathVis[]=new boolean[n];
        boolean vis[]=new boolean[n];
        for (int i = 0; i <n ; i++) {

            if(edges[i]==-1) continue;
            if (vis[i]==false){

                ArrayList<Integer> ds=new ArrayList<>();

                dfs(i,adj,wrap,ds,vis,pathVis,i);

            }
        }
        System.out.println(wrap);
        if (wrap.size()==0) return -1;
        int mini=Integer.MIN_VALUE;
        for (ArrayList list:wrap
             ) {
            int start=-1;
            int end=-1;
            for (int i = 0; i <list.size() ; i++) {
                for (int j = i+1; j <list.size() ; j++) {

                    if(list.get(i)==list.get(j)){
                        start=i;
                        end=j;

                        mini= Math.max(mini,end-start);
                        break;
                    }
                }
            }

        }

        return mini;
    }
    public static void main(String[] args) {
        int edges []= {3,3,4,2,3};
     int ans=longestCycle(edges);
        System.out.println(ans);
    }
        }
