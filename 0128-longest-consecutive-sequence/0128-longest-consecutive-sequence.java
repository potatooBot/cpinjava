class Solution {
    public int longestConsecutive(int[] nums) {
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
}