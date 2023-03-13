package Graph.Kahn_Algorithm;
import java.util.*;
public class kahn_algorithm {
    static ArrayList topoSort(int V,ArrayList<ArrayList<Integer>> adj){
        int indegree[]=new int[V];
        for (int i = 0; i <V ; i++) {
            for (Integer it:
                    adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
ArrayList <Integer> topoSort=new ArrayList<>();
        for (int i = 0; i <V ; i++) {
            if(indegree[i]==0) {
                q.add(i);
            }
        }

        while (!q.isEmpty())
        {
            int node=q.peek();
topoSort.add(node);
q.remove();
            for (Integer it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it]==0){

                    q.add(it);
                }
            }
        }
        return topoSort;
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

       ArrayList ans = kahn_algorithm.topoSort(V, adj);
        System.out.println(ans);
    }
}
