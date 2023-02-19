package Algorithm.SlidingWIndow;

public class maximum_ascending_subarray_sum {
    public static int maxAscendingSum(int[] nums) {
        if(nums.length==1) return nums[0];
int sum=0;
int far=0;
int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length-1 ; i++) {
          sum=sum+nums[i];
          if(nums[i]>=nums[i+1]){
              max=Math.max(max,sum);
              sum=0;
          }


        }
        if(nums[nums.length-2]<nums[nums.length-1]) sum=sum+nums[nums.length-1];
        max=Math.max(max,sum);
        if(max==Integer.MIN_VALUE) return sum;
return max;
    }
    public static void main(String[] args) {
        int [] nums = {3,6,10,1,8,9,9,8,9};
        int ans=maxAscendingSum(nums);
        System.out.println(ans);
    }
}
