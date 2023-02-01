package Oracle;

import java.util.*;
class customCum implements Comparator<Map.Entry<Integer,Integer>>{

    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        if(o1.getValue()==o2.getValue()) return o2.getKey()-o1.getKey();
        else return o1.getValue()-o2.getValue();
    }
}

public class sort_element_by_frequency {
    public static int[] sortByfreq(int nums[]){
        HashMap <Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(new customCum());
       pq.addAll(map.entrySet());

        int res[]=new int[nums.length];
        int j=0;
        while (!pq.isEmpty()){
        Map.Entry<Integer,Integer> entry= pq.poll();
            for (int i = 0; i <entry.getValue() ; i++) {
                res[j++]= entry.getKey();
            }
        }



        return res;
    }
    public static void main(String[] args) {
        int [] nums = {-1,1,-6,4,5,-6,1,4,1};
    int res[]=sortByfreq(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
}
