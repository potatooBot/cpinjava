
//Alien Dictionary – Topological Sort: G-26
//        Problem Statement: Given a sorted dictionary of an alien language having N words and k starting alphabets of a standard dictionary. Find the order of characters in the alien language.
//
//        Note: Many orders may be possible for a particular test case, thus you may return any valid order.




package Graph.Kahn_Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class alien_dictionary {
    public static List topoSort(int V,List<List<Integer>> adj){
        int indegree[]=new int[V];
        for (int i = 0; i <V ; i++) {
            for (Integer it:
                 adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i <V ; i++) {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        List <Integer> topo=new ArrayList<>();
        while (!q.isEmpty()){
            int node= q.peek();
            topo.add(node);
            q.remove();

            for (Integer it:
                 adj.get(node)) {
                indegree[it]--;
                if (indegree[it]==0)
                {
                    q.add(it);
                }
            }
        }
        return topo;
    }
    public String findOrder(String [] dict, int N, int K)
    {
      List < List<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <K ; i++) {
            adj.add(new ArrayList<>());
        }


        // ! Make adjecncy list if string 1 character is not equal to string 2 character .
        // ! Make a directed graph from String 1 to String 2


        for (int i = 0; i < N -1; i++) {
            String s1=dict[i];
            String s2=dict[i+1];
        int len=Math.min(s1.length(),s2.length());
            for (int j = 0; j <len ; j++) {
                if(s1.charAt(j)!=s2.charAt(j)){
                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                break;
                }

            }
        }

        List <Integer> topo=topoSort(K,adj);
String ans="";
        for (Integer it:
             topo) {
         ans= ans+ (char)(it + (int)'a');
        }
        System.out.println(ans);
return ans;
    }
    public static void main(String[] args) {
        int N = 5, K = 4;
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        alien_dictionary obj = new alien_dictionary();
        String ans = obj.findOrder(dict, N, K);

        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i) + " ");
        }
        System.out.println("");
    }
}

//    Time Complexity: O(N*len)+O(K+E), where N is the number of words in the dictionary, ‘len’ is the length up to the index where the first inequality occurs, K = no. of nodes, and E = no. of edges.
//
//        Space Complexity: O(K) + O(K)+O(K)+O(K) ~ O(4K), O(K) for the indegree array, and O(K) for the queue data structure used in BFS(where K = no.of nodes), O(K) for the answer array and O(K) for the adjacency list used in the algorithm.