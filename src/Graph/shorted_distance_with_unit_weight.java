package Graph;
import java.util.*;




//
//Time Complexity: O(M) { for creating the adjacency list from given list ‘edges’} + O(N + 2M) { for the BFS Algorithm} + O(N) { for adding the final values of the shortest path in the resultant array} ~ O(N+2M).
//
//        Where N= number of vertices and M= number of edges.
//
//        Space Complexity:  O( N) {for the stack storing the BFS} + O(N) {for the resultant array} + O(N) {for the dist array storing updated shortest paths} + O( N+2M) {for the adjacency list} ~ O(N+M) .
//




public class shorted_distance_with_unit_weight {
    public static void main(String[] args) {
        int n = 8, m = 7;
        int edge[][] = {{1,3},{3,5},{5,7},{7,1},{0,2},{2,4},{4,0}};

        int res[] = shortestPath(edge, n, m, 0);
        System.out.println("ShortedDistance with Unit Weight");
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }

        System.out.println();
    }


    public static int[] shortestPath(int[][] edges, int n, int m, int src) {
        //Create an adjacency list of size N for storing the undirected graph.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        System.out.println(adj);        //A dist array of size N initialised with a large number to
        //indicate that initially all the nodes are untraversed.
        int dist[] = new int[n];
        for (int i = 0; i < n; i++) dist[i] = (int) 1e9;
        dist[src] = 0;

        // BFS Implementation
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()) {
            int node = q.peek();
            q.remove();
            for (int it : adj.get(node)) {
                if (dist[node] + 1 < dist[it]) {
                    dist[it] = 1 + dist[node];
                    q.add(it);
                }
            }
        }
        // Updated shortest distances are stored in the resultant array ‘ans’.
        // Unreachable nodes are marked as -1.
        for (int i = 0; i < n; i++) {
            if (dist[i] == 1e9) {
                dist[i] = -1;
            }
        }
        return dist;
    }
}

