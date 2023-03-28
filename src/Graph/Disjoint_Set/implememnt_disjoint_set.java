package Graph.Disjoint_Set;

import java.util.ArrayList;
import java.util.*;


class DisjointSet{


        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();
        List<Integer> size = new ArrayList<>();
        public DisjointSet(int n) {
            for (int i = 0; i <= n; i++) {
                rank.add(0);
                parent.add(i);
                size.add(1);
            }
        }

        public int findUlp(int node) {
            if (node == parent.get(node)) {
                return node;
            }
            int ulp = findUlp(parent.get(node));
            parent.set(node, ulp);
            return parent.get(node);
        }

        public void unionByRank(int u, int v) {
            int ulp_u = findUlp(u);
            int ulp_v = findUlp(v);
            if (ulp_u == ulp_v) return;
            if (rank.get(ulp_u) < rank.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
            } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
                parent.set(ulp_v, ulp_u);
            } else {
                parent.set(ulp_v, ulp_u);
                int rankU = rank.get(ulp_u);
                rank.set(ulp_u, rankU + 1);
            }
        }

        public void unionBysize(int u, int v) {
            int ulp_u = findUlp(u);
            int ulp_v = findUlp(v);
            if (ulp_u == ulp_v) return;
            if (size.get(ulp_u) < size.get(ulp_v)) {
                parent.set(ulp_u, ulp_v);
                size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
            } else {
                parent.set(ulp_v, ulp_u);
                size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
            }
        }
    }


public class implememnt_disjoint_set {
    public static void main(String[] args) {
DisjointSet ds=new DisjointSet(7);
//        ds.unionByRank(1, 2);
//        ds.unionByRank(2, 3);
//        ds.unionByRank(4, 5);
//        ds.unionByRank(6, 7);
//        ds.unionByRank(5, 6);


        ds.unionBysize(1, 2);
        ds.unionBysize(2, 3);
        ds.unionBysize(4, 5);
        ds.unionBysize(6, 7);
        ds.unionBysize(5, 6);
        if (ds.findUlp(3) == ds.findUlp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionBysize(3, 7);


        if (ds.findUlp(3) == ds.findUlp(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}
