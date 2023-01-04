package Leetcode_Daily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class minimum_round_to_complete_all_task_2244 {
    public static int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        HashMap <Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < tasks.length ; i++) {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1 );
        }
        System.out.println(map);
        int count=0;
        Set<Map.Entry<Integer,Integer>> s = map.entrySet();
        for (Map.Entry<Integer,Integer> entry:s) {
            if(entry.getValue()==2||entry.getValue()==3) {
                map.replace(entry.getKey(),0);
             count++;
            }
            if(entry.getValue()>3) {
               if(entry.getValue()%3==0) {
                   count=count+entry.getValue()/3;
               }
               if(entry.getValue()%3!=0&&entry.getValue()%3==1) {
                   count=count+entry.getValue()/3  +1;
                   map.replace(entry.getKey(), 0);
               }
                if(entry.getValue()%3!=0&&entry.getValue()%3==2) {
                    count=count+entry.getValue()/3 +1;
                    map.replace(entry.getKey(), 0);
                }
            }
            System.out.println(map);
            if(entry.getValue()==1) return -1;

//            System.out.println(count);
        }

        return count;
    }
    public static void main(String[] args) {
//        int []tasks = {2,2,3,3,2,4,4,4,4,4};
//        int []tasks = {2,3,3};
//        int []tasks = {5,5,5,5};
        int []tasks = {66,66,63,61,63,63,64,66,66,65,66,65,61,67,68,66,62,67,61,64,66,60,69,66,65,68,63,60,67,62,68,60,66,64,60,60,60,62,66,64,63,65,60,69,63,68,68,69,68,61};
        int res=minimumRounds(tasks);
        System.out.println(res);
    }
}
