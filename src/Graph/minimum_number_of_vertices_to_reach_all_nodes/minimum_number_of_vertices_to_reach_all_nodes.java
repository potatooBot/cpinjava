package Graph.minimum_number_of_vertices_to_reach_all_nodes;

import java.util.ArrayList;
import java.util.*;

public class minimum_number_of_vertices_to_reach_all_nodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
List <Integer> ans=new ArrayList<>();
ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <edges.size() ; i++) {
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }
        int indegree[]=new int[n];
        for (int i = 0; i <n ; i++) {
            for (int it:
                 adj.get(i)) {
                indegree[it]++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (indegree[i]==0) {
                ans.add(i);
            }
        }


return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> edges= new ArrayList<>();
        for (int i = 0; i <n; i++) {
            edges.add(new ArrayList<>());
        }


    }
}
