package Greedy;
/// <summary>
/// Given an array of non-negative integers, you are initially positioned at
/// the first index of the array. Each element in the array represents your
/// maximum jump length at that position. Determine if you are able to reach
/// the last index.
/// </summary>
/// <example>
/// A = [2,3,1,1,4], return true.
/// A = [3,2,1,0,4], return false.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class jump_game {
    static boolean minJumps(int[] nums){

        int max=0;
        for(int i=0;i<nums.length;i++) {
            if(i>max)
                return false;
            max = Math.max(nums[i]+i, max);
        }
        return true;
        }
    public static void main(String[] args) {
        int arr[]={2,0};
        boolean res=minJumps(arr);
        System.out.println(res);

    }
}
