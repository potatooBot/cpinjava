package Greedy;
import java.util.*;
public class minimum_operation_to_make_array_empty {
   static public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1) return -1;
            if(entry.getValue()%3==0){
                count=count+entry.getValue()/3;
                map.remove(entry.getKey(),0);

            } else if (entry.getValue()%2==0) {
                count=count+entry.getValue()/3+1;
            } else if (entry.getValue()%3==1) {
                count=count+(entry.getValue()/3 ) +1;
                map.remove(entry.getKey(),0);
            } else if (entry.getValue()%3==2) {
                count=count+entry.getValue()/3+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        int arr[]={19,19,19,19,19,19,19,19,19,19,19,19,19};
        int arr[]={13,7,13,7,13,7,13,13,7};
   int ans=minOperations(arr);
        System.out.println(ans);
   }
}
