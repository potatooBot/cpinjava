class Solution {

    public int maximizeGreatness(int[] nums) {
     Arrays.sort(nums);

     int i=0;int j=0;
     int cnt=0;
     while(i<nums.length&&j<nums.length){
        if(nums[i]<nums[j])
     {
        cnt++;
        i++;
     }
     j++;
     }   


     return cnt;
    }

}