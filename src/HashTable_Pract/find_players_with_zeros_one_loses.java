package HashTable_Pract;

import java.util.*;

public class find_players_with_zeros_one_loses {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=matches.length;
        TreeMap <Integer,Integer> mapWin=new TreeMap<>();
        TreeMap <Integer,Integer> maplose=new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            mapWin.put(matches[i][0],0);
        }
        for (int i = 0; i <n ; i++) {
            if(mapWin.containsKey(matches[i][1]))
            mapWin.put(matches[i][1],mapWin.get(matches[i][1])+1);
            maplose.put(matches[i][1],maplose.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry: mapWin.entrySet()
             ) {

            if (entry.getValue()==0) {
                list.add(entry.getKey());
            }
        }
        ans.add(new ArrayList<>(list));
        list.clear();
        for (Map.Entry<Integer,Integer> entry: maplose.entrySet()
             ) {
            if (entry.getValue()==1) {
                list.add(entry.getKey());
            }
        }
        ans.add(new ArrayList<>(list));
    return ans;
    }
    public static void main(String[] args) {
     int [][]   matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> ans=  findWinners(matches);
        System.out.println(ans);
    }
}
