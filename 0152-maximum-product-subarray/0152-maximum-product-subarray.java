class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        for(int i=0;i<nums.length;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref=pref*nums[i];
            suff=suff*nums[nums.length-i-1];
            maxi=Math.max(maxi,Math.max(pref,suff));
        }
        
        
        return maxi;
    }
}