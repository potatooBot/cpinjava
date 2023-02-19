package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class beauty_of_graph {
   static final int MAXN = 26;
   static int n, m;
   static List<Integer>[] g = new ArrayList[MAXN];
    static Map<Integer, Integer> cnt = new HashMap<>();
    static int[] in = new int[MAXN];
   static boolean[] st = new boolean[MAXN];

     static int dfs(int u) {
        st[u] = true;
        int res = 0;
        for (int i = 0; i < g[u].size(); i++) {
            int v = g[u].get(i);
            if (!st[v]) res = Math.max(res, dfs(v));
        }
        cnt.put(res + 1, cnt.getOrDefault(res + 1, 0) + 1);
        return res+1;
    }

    public static int beauty(int n, int m, String s, int[] x, int[] y) {
        beauty_of_graph.n = n;
        beauty_of_graph.m = m;
        for (int i = 0; i < MAXN; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            g[x[i]].add(y[i]);
            in[y[i]]++;
        }

        for (int i = 0; i < n; i++)
            if (in[i] == 0)
                dfs(i);
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet())
            ans = Math.max(ans, entry.getValue() * entry.getKey());
        return ans-1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 6;
        int m = 4 ;
        String s = "abaca";
        int[] x = {1, 1, 3, 4};
        int[] y = {2, 3, 4, 5};
        System.out.println(beauty(n, m, s, x, y));
    }




}
