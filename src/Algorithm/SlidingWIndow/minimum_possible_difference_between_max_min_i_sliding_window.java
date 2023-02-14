package Algorithm.SlidingWIndow;

import java.util.ArrayList;
import java.util.Collections;

public class minimum_possible_difference_between_max_min_i_sliding_window {
    public static int minimumDifference(int[] nums, int k) {
int start=0;
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;

        ArrayList <Integer> ans=new ArrayList<>();
        for (int i = 0; i < nums.length ; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }

            if (i-start+1==k) {
                int diff = max - min;
            ans.add(diff);
            if(max==nums[start]) {
                max=Integer.MIN_VALUE;
            }
            if(min==nums[start]) {
                min=Integer.MAX_VALUE;
            }

            start++;
            }
        }
        return Collections.min(ans);
    }
    public static void main(String[] args) {
        int nums []= {9,4,1,7}, k = 2;
        int ans=minimumDifference(nums,k);
        System.out.println(ans);
    }
}
