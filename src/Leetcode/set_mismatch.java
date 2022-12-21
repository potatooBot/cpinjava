package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class set_mismatch {
    public static int[] findErrorNums(int[] nums) {

        int dup = 0, miss = 0;
        HashSet<Integer> set = new HashSet<>();

        // find duplicate using set
        for(int i = 0; i < nums.length; ++i){
            if(set.contains(nums[i]))   dup = nums[i];
            set.add(nums[i]);
        }

        // find missing
        for(int i = 1; i <= nums.length; ++i){
            if(set.contains(i) == false){
                miss = i;
                break;
            }
        }

        return new int[]{dup, miss};
    }

    public static void main(String[] args) {
        int nums[] ={1,1};
        int arr[]=new int[2];
        arr=findErrorNums(nums);
        for (int i = 0; i <2 ; i++) {
            System.out.println(arr[i]);
        }

    }
}
