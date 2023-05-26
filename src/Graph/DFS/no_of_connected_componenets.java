package Graph.DFS;
import java.util.*;
public class no_of_connected_componenets {
    static int vertices;
    static int edges;

    private static void dfs(ArrayList<ArrayList<Integer>> A, int i, boolean v[]) {
        v[i] = true;
        vertices++;
        edges += A.get(i).size();
        for (int child : A.get(i)) {
            if (!v[child]) {
                dfs(A, child, v);
            }
        }
    }

    static  public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean v[] = new boolean[V + 1];
        int ans = 0;
        for (int i = 1; i <= V; i++) {
            if (!v[i]) {
                vertices = 0;
                edges = 0;
                dfs(adj, i, v);
                edges /= 2;
                if (edges == ((long)vertices * (vertices - 1)) / 2) ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int E=3;int  V=3;
        int edges[][]= {{1, 2},
                {1, 3},
                {3, 2}};
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 1; i <=V+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i <E; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }


int ans=findNumberOfGoodComponent(V,adj);
        System.out.println(ans);
    }
}
