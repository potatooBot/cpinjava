package HashTable_Pract;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class remove_from_sroted_array_2 {
    static     public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer> map=new TreeMap<>();

        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }

int i=0;
        int count=0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
if (entry.getValue()==1){
    nums[i++]=(int) entry.getKey();
count++;
}
else if(entry.getValue()>=2) {
    nums[i++]=entry.getKey();
    nums[i++]=entry.getKey();
count=count+2;
}
        }

        return count;
    }
    public static void main(String[] args) {
        int []nums = {0,0,1,1,1,1,2,3,3};
int ans=removeDuplicates(nums);
        for (int i = 0; i <ans ; i++) {
            System.out.println(nums[i]);
        }

    }
}
