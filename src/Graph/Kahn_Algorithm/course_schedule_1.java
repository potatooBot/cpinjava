package Graph.Kahn_Algorithm;
import java.util.*;
public class course_schedule_1 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i <numCourses ; i++) {
            adj.add(new ArrayList<>());
        }
        int n= prerequisites.length;
        for (int i = 0; i < n ; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        System.out.println(adj);

        int indegree[]=new int[numCourses];
        for (int i = 0; i <numCourses ; i++) {
            for (Integer it:
                    adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
ArrayList <Integer> topoSort=new ArrayList<>();
        for (int i = 0; i <numCourses ; i++) {
            if(indegree[i]==0) {
                q.add(i);
            }
        }
        int count=0;
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
        if(topoSort.size()==numCourses) return true;
        return false;
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int prerequisites[][] = {{1,0},{0,1}};
        boolean ans=canFinish(numCourses,prerequisites);
        System.out.println(ans);
    }
}
