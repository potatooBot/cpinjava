package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class maxmimum_pairs_array {
    static    public int[] numberOfPairs(int[] nums) {

        int ans[]=new int[2];
HashMap <Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()
             ) {
            count=count +entry.getValue()/2;
            map.replace(entry.getKey(), entry.getValue()%2);
        }
        int remCount=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()
             ) {
      if(entry.getValue()==1)
           remCount++;
        }
ans[0]=count;
ans[1]=remCount;
        return ans;
    }
    public static void main(String[] args) {
        int  nums[] = {1,3,2,1,3,2,2};
int ans[]=numberOfPairs(nums);
        for (int it:ans
             ) {
            System.out.println(it);
        }
    }
}
