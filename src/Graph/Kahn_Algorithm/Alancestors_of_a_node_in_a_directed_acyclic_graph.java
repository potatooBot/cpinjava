package Graph.Kahn_Algorithm;

import java.util.*;

public class Alancestors_of_a_node_in_a_directed_acyclic_graph {
    static    public List<List<Integer>> getAncestors(int n, int[][] edges) {
List<List<Integer>> ans=new ArrayList<>();
ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length ; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        int indegree[]=new int[n];
        for (int i = 0; i <n ; i++) {
            for (Integer it :  adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i <indegree.length ; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while (!q.isEmpty()){
            int node=q.peek();
            q.remove();


            for (Integer it: adj.get(node)) {
                ans.get(it).add(node);
                indegree[it]--;
                for (int i = 0; i <ans.get(node).size() ; i++) {
                    ans.get(it).add(ans.get(node).get(i));
                }

            if(indegree[it]==0){
                q.add(it);
            }
            }
        }
//        System.out.println(ans);

List <List<Integer>> ancest=new ArrayList<>();
        for (int i = 0; i <ans.size() ; i++) {



            Collections.sort(ans.get(i));
            Set <Integer> set=new HashSet<>();
            for (int j = 0; j < ans.get(i).size(); j++) {
             set.add(ans.get(i).get(j));
            }
            ancest.add(new ArrayList<>(set));
        }


        return ancest;
    }
    public static void main(String[] args) {
     int [][]  edgeList = {{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}};
        List <List<Integer>> ans=getAncestors(8,edgeList);
        System.out.println(ans);
    }
}
