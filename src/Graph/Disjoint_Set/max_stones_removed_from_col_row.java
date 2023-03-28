package Graph.Disjoint_Set;

import Heap_Practice.HeapApp;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class max_stones_removed_from_col_row {
    static   public int removeStones(int[][] stones) {
int maxRow=0;
int maxCol=0;
int n=stones.length;
        for (int i = 0; i <n ; i++) {

            maxRow=Math.max(maxRow,stones[i][0]);
            maxCol=Math.max(maxRow,stones[i][1]);
        }
        DisjointSet ds=new DisjointSet(maxRow+maxCol+1);
        HashMap<Integer,Integer> stonesMap=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            int nodeRow=stones[i][0];
            int nodeCol=stones[i][1] +maxRow+1;
            ds.unionBysize(nodeRow,nodeCol);
        stonesMap.put(nodeRow,1);
        stonesMap.put(nodeCol,1);
        }
int count=0;
        for (Map.Entry<Integer,Integer> it:
             stonesMap.entrySet()) {
            if(ds.findUlp(it.getKey())==it.getKey()){
            count++;
            }
        }


        return n-count;
    }
    public static void main(String[] args) {
        int stones[][]= {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
int ans=removeStones(stones);
        System.out.println(ans);
    }
}
