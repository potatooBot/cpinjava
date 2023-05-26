package Graph.Eventual_safe_state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class eventual_safe_state {
   static public List<Integer> eventualSafeNodes(int[][] graph) {

       int v = graph.length;
       List<Integer> ans = new LinkedList<>();
       List<List<Integer>> adj = new ArrayList<>();
       for(int i = 0; i < v; i++) {
           adj.add(new ArrayList<>());
       }
       int[] indeg = new int[v];
       for(int i = 0; i < v; i++) {
           for(int j : graph[i]) {
               adj.get(j).add(i);
               indeg[i]++;
           }
       }
       System.out.println(Arrays.stream(indeg).boxed().collect(Collectors.toList()));
       Queue<Integer> q = new LinkedList<>();
       for(int i = 0; i < v; i++) {
           if(indeg[i] == 0) q.add(i);
       }
       while(!q.isEmpty()) {
           int temp = q.poll();
           ans.add(temp);
           for(int j : adj.get(temp)) {
               indeg[j]--;
               if(indeg[j] == 0) q.add(j);
           }
       }
       Collections.sort(ans);
       return ans;
    }
    public static void main(String[] args) {
        int graph[][]= {{1,2,3,4},{1,2},{3,4},{0,4},{}};
        List<Integer> ans=eventualSafeNodes(graph);
        System.out.println(ans);

    }
}
