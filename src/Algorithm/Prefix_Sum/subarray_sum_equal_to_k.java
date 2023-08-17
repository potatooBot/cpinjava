package Algorithm.Prefix_Sum;

import java.util.HashMap;

public class subarray_sum_equal_to_k {
    static  public int subarraysDivByK(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            sum = sum + nums[i];
            int remSum = sum - target;

            if (map.containsKey(remSum)) {
                count = count + map.get(remSum);
            } else {
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
return count;

    }
    public static void main(String[] args) {
        int [] nums = {3,1,2,4};int  k = 6;
        int count=subarraysDivByK(nums,k);

        System.out.println(count);
    }
}
