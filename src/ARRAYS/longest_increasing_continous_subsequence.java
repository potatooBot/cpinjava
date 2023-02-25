package ARRAYS;

public class longest_increasing_continous_subsequence {
    public static int findLengthOfLCIS(int[] nums) {
int max=1;
int count=1;
        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i]<nums[i+1]) {
                count++;

            }
            else {
                count=1;

            }
            max=Math.max(max,count);
        }
return max;
    }
    public static void main(String[] args) {
        int  nums[] = {1};
int ans=findLengthOfLCIS(nums);
        System.out.println(ans);

    }
}
