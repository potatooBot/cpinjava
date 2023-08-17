package Algorithm.Prefix_Sum.Minimum_subarray_sum;

import java.util.HashMap;

public class minumum_size_subarray_sum {
    static public int minSubArrayLen(int target, int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefSum=0;
        int start=0;
        int maxi=Integer.MAX_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            prefSum+=nums[i];
            if(prefSum>=target){
                while(prefSum>=target){
                    maxi=Math.min(maxi,i-start+1);

                    prefSum=prefSum-nums[start];
                    start++;

                }

            }

        }
if(maxi==Integer.MAX_VALUE){
    return 0;
}
        return maxi;
    }
    public static void main(String[] args) {
        int target = 15;int []nums = {1,2,3,4,5};
    int ans=minSubArrayLen(target,nums);
        System.out.println(ans);
    }
}
