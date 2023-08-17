package Algorithm.SDE_QUESTIONS;

import java.util.HashSet;

public class longest_consecutive_sequence {
    static  public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        int longestStreak=0;
        for (int elem:
             nums) {
            if(!set.contains(elem-1)){
                int currentStreak=1;
                int currentNum=elem;
            while (set.contains(currentNum+1)){
                currentNum=currentNum+1;
                currentStreak=currentStreak+1;
            }
            longestStreak=Math.max(longestStreak,currentStreak);
            }
        }

        return longestStreak;
    }
    public static void main(String[] args) {
        int nums[]={100,4,200,1,3,2};
        int ans=longestConsecutive(nums);
        System.out.println(ans);
    }
}
