package Algorithm.Binary_Search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class single_element_in_sorted_array {
    public static int singleNonDuplicate(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()==1) return entry.getKey();
        }
return 0;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
        int ans=singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
