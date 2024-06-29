class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
int low=0;
int high=nums.length-1;

double mini=100000000;
        for(int i=1;i<=nums.length/2;i++){
double val=(double)(nums[low]+nums[high])/2;
//System.out.println(val);
        mini=Math.min(mini,val);
        low++;
        high--;
        }
        return mini;
    }
}